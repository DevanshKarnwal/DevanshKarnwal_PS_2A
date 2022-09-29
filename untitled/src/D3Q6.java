import java.util.*;
public class D3Q6 {
    public static void main(String[] args) {
        int x,n,i,j,b=1;
        float s=0f,a=1f;
        System.out.println("Enter number of terms");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter value of x");
        x= sc.nextInt();
        for(i=2;i<2*n;i=i+2)
        {
            for(j=1;j<=i;j++)
            {
                a=a*j;
            }
            if(b%2!=0)
            {
                s=s-(float)((Math.pow(x,i))/a);
                a=1f;
            }
            else
                s=s+(float)((Math.pow(x,i))/a);

        }
        s=s+1;
        System.out.println("the sum is "+s);
    }
}
