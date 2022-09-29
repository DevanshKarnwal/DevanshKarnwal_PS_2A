import java.util.*;
public class D4Q4 {
    static void perfect(int x)
    {
        int i,z=0,j;
        System.out.println("Perfect numbers are ");
        for(i=1;i<=x;i++)
        {
            for(j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    z=z+j;
                }
            }
            if(z==i)
            {
                System.out.print(z+" ");
                z=0;
            }
            z=0;
        }


    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for range");
        n=sc.nextInt();
        perfect(n);
    }
}
