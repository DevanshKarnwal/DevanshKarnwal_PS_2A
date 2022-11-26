import java.util.*;
public class D6Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m;
        System.out.println("Enter order of square matrix");
        m=sc.nextInt();
        int a[][]=new int[m][m];
        System.out.println("Enter elements");
        for (int i=0;i<m;i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=m-1;i>=0;i--)
        {
            for(int j=m-1;j>=0;j--)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
