import java.util.*;
public class D3Q7 {
    static int fact(int n)
    {
        int s=1;
        for(int j=1;j<=n;j++)
        {
            s=s*j;
        }
        return s;
    }
    public static void main(String[] args) {
        int i,n,j;
        float s=0f,a=1f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            a=1f;
//            for(j=1;j<=2*i-1;j++)
//            {
//                a=a*j;
//            }
            a=fact(2*i-1);
            if(i%2==0)
            {
                s=s-(float)(i/a);
            }
            else
            {
                s=s+(float)(i/a);
            }

        }
        System.out.println("The sum is "+s);
    }
}
