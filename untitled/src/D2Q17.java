import java.util.*;
public class D2Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter number of terms");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(j=1;j<=i-1;j++)
            {
                System.out.print(i-j);
            }
            System.out.print(" ");
        }

    }
}
