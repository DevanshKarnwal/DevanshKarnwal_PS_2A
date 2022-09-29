import java.math.*;
import java.util.*;
public class D3Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,n,i,j,b=1;
        float s=0f,a=1f;
        System.out.println("enter value of x");
        x=sc.nextInt();
        System.out.println("enter number of terms");
        n=sc.nextInt();
        for(i=1;i<=n-1;i++)
        {
            for(j=1;j<=i;j++)
            {
                a=a*j;
            }
            if(i%2==0)
            {
                s=(float)(s+(Math.pow(x,i))/a);
            }
            else
            {
                s=(float)(s-(Math.pow(x,i))/x);

            }
        }
        s=s+b;
        b=0;
        System.out.println("the output is "+s);
    }
}