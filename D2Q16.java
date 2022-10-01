import java.util.*;
public class D2Q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n,c,z;
//        System.out.println("Enter a number");
//        n=sc.nextInt();
//        c=n;
//        z=n;
//        for(int i=1;i<2*n-1;i++)
//            System.out.print(n);
//        for(int i=1;i<2*n-3;i++)
//        {
//            for(int j=1;j<2*n-1;j++)
//            {
//                for(int k=1;k<2*n-1;k++)
//                {
//                    System.out.print(n);
//                    while(z<=c-1)
//                    {
//                        System.out.print(z);
//                        z++;
//                    }
//                    z=n;
//                    c--;
//                }
//            }
//        }
        int i,n,j,z,a;
        System.out.println("Enter a number");
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
