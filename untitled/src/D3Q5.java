import java.util.*;
public class D3Q5 {
    public static void main(String[] args) {
        int n,i,j,x,b=1;
        float a=0f,s=1f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x");
        x= sc.nextInt();
        System.out.println("Enter number of terms");
        n = sc.nextInt();
        for(i=1;i<=2*n;i=i+2)
        {
            for(j=1;j<=i;j++)
            {
                s = s*j;
            }
            if(b%2==0)
            {
                a=(float)(a-(float)((Math.pow(x,i))/s));
                b++;
            }
            else
            {
                a=(float)(a+(float)((Math.pow(x,i))/s));
                b++;
            }
        }
        System.out.println("the result is "+a);
    }
}
