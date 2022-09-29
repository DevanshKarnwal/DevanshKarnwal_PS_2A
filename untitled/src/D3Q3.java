import java.util.*;
import java.math.*;
public class D3Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,b=1,x,i,j;
        float a=0f,s=1f;
        System.out.println("Enter a number");
        x=sc.nextInt();
        System.out.println("enter number of terms");
        n=sc.nextInt();
        for(i=1;i<=n-1;i++)
        {
            for(j=1;j<=i;j++)
            {
                s=s*i;
            }
            a=(float)(a+b+(Math.pow(x,i))/i);
            b=0;
        }
        System.out.println("the sum is "+a);
    }
}
