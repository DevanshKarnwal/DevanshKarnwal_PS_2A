import java.util.Scanner;
public class D6Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Enter number of rows and columns");
        m=sc.nextInt();
        n= sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter elements");
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        for(int j=0;j<n;j++)
        {
            for(int i=m-1;i>-1;i--)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
