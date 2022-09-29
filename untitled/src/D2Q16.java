import java.util.*;
public class D2Q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,c,z;
        System.out.println("Enter a number");
        n=sc.nextInt();
        c=n;
        z=n;
        for(int i=1;i<2*n-1;i++)
            System.out.print(n);
        for(int i=1;i<2*n-3;i++)
        {
            for(int j=1;j<2*n-1;j++)
            {
                for(int k=1;k<2*n-1;k++)
                {
                    System.out.print(n);
                    while(z<=c-1)
                    {
                        System.out.print(z);
                        z++;
                    }
                    z=n;
                    c--;
                }
            }
        }
    }
}
