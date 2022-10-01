import java.util.*;
public class D2Q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,j,z,a;
        System.out.println("Enter a number ");
        n=sc.nextInt();
        a=n;
        n=2*n-2;
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=n;j++)
            {
                z=a-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(z+" ");
            }
            System.out.println();

        }
    }
}
