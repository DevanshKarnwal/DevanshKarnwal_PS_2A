import java.util.*;
public class D4Q10 {
    static int pow(int n,int m)
    {
            int i;
            for(i=1;i<m-1;i++)
            {
                n=n*n;
            }
            return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a numer and power upto which to be calculated");
        a=sc.nextInt();
        b=sc.nextInt();
        c=pow(a,b);
        System.out.println("The answer is "+c);
    }
}
