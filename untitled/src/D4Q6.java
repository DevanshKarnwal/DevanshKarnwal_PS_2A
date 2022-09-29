import java.util.*;
public class D4Q6 {
    static void armstrong(int x)
    {
        int s=0,a,n,z,count=0;
        int i,j,k;
        z=x;
        System.out.println("Armstrong numbers are");
        for(i=1;i<x;i++)
        {
            k=i;
            for(j=i;j>0;j=j/10)
            {
                count++;
            }
            while(k>0)
            {
                a=k%10;
                s=s+(int)(Math.pow(a,count));
                k=k/10;
            }
            if(s==i)
                System.out.print(s+" ");
            s=0;
            count=0;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        armstrong(n);
    }
}
