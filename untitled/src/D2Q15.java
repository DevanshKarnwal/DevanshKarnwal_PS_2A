import java.util.*;
public class D2Q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,z=0,i,j,a,rev=0,count=0,b = 0;
        System.out.println("Enter a term");
        n1=sc.nextInt();
        System.out.print("1");
        a=1;
       for(i=1;i<n1;i++) {
           while (a > 0) {
               n2 = a % 10;
               rev = rev * 10 + n2;
               a = a / 10;
           }
           while (rev > 0) {
               z=rev%10;
               count++;
               b = count;
               rev=rev/10;
           }
           a =b*10+z;
           System.out.println(a);
       }
    }
}
