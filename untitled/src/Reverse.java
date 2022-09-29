import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,a,s=0,b;
        System.out.println("Enter a number");
        n = sc.nextInt();
        b=n;
        while(n>0)
        {
            a = n%10;
            s = s*10 + a;
            n = n/10;
        }
        System.out.println("The reverse of number is "+s);
        if(b==s)
            System.out.println("palindrome");
    }
}
