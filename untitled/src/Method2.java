import java.util.*;
public class Method2 {
    static void prime(int x)
    {
        int i,c=1;
        for(i=2;i<x;i++)
        {
            if(x%i==0)
            {
                c++;
            }
        }
        if(c==1)
            System.out.println("prime number");
        else
            System.out.println("not prime");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter a number");
        n=sc.nextInt();
        prime(n);
    }
}
