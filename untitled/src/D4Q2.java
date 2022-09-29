import java.util.*;
public class D4Q2 {
    static float b[]=new float[50];
    static void sum(int n)
    {   float s=0,a;
        System.out.println("enter terms");
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=n;i++)
        {
            a=sc.nextFloat();
            b[i]=a;
            s=s+a;
        }
        s=s/n;
        System.out.println("mean is "+s);
    }
    static void median(int n)
    {
        int z=n;
        float a;
        System.out.println("enter terms");
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=n;i++)
        {
            a=sc.nextFloat();
            b[i]=a;
        }
        if(z%2==0)
        {
            System.out.println("median is "+b[z/2]+" "+b[z/2+1]);

        }
        else
            System.out.println("median is "+b[(z+1)/2]);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,n,mean;
        System.out.println("Enter number of terms");
        n= sc.nextInt();
        sum(n);
        median(n);
    }
}
