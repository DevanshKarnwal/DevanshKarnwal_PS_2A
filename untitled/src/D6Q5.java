import java.util.Scanner;
public class D6Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i=0,j=0;
        System.out.println("Enter order of matrix");
        n = sc.nextInt();
        int A[][] = new int[n][n];
        System.out.println("Enter elements of matrix");
        for ( i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }
        i=0;
        j=0;
        for(int k=1;k<=2*n-1-n;k=k+2)
        {
            while(j<n)
            {
                System.out.print(A[i][j]+" ");
                j++;
            }
            j=j-1;
            i++;
            while(i<n)
            {
                System.out.print(A[i][j]+" ");
                i++;
            }
            i=i-1;
            j=j-2;
            while(j>0)
            {
                System.out.print(A[i][j]+" ");
                j--;
            }
            j=j+1;

            while(i>0)
            {
                System.out.print(A[i][j]+" ");
                i--;
            }
            i=i+1;
        }
    }
}
