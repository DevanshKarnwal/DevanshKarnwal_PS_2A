import java.util.*;
public class d3Q2 {
    public static void main(String[] args) {
        int i,j,n;
        float s=0f,a=1f;
        System.out.println("enter number of terms");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                a=a*j;
            }
            s=s+a/i;
            a=1;
        }
        System.out.println("the sum of n terms is "+s);
    }
}
