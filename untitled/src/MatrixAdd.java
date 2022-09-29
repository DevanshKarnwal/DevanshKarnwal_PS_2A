import java.util.*;
public class MatrixAdd {
    public static void main(String[] args) {
        int A[][]=new int[3][3],B[][]=new int[3][3],C[][]=new int[3][3];
        int i,j;
        System.out.println("enter elements of matrix A");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter elements of matrix B");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                B[i][j]=sc.nextInt();
            }
        }
        System.out.println("sum is");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
