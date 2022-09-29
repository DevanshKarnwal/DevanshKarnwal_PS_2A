import java.util.*;
public class D3Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n,j;
        System.out.println("enter number of terms");
        n= sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
}
