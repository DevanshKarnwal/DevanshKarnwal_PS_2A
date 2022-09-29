import java.util.*;
public class D4Q5 {
    static void prime(int x)
    {
        int i,j,flag=0;
        System.out.println("prime numbers are");
        for (i=1;i<x;i++)
        {
            for(j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    flag++;
                }
            }
            if(flag==1)
                System.out.print(i+" ");
            flag=0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        prime(n);
    }
}
