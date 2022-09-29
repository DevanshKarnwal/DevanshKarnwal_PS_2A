import java.util.*;
public class MatrixMultiply {
    public static void main(String[] args) {
        int A[][]=new int[3][3],B[][]=new int[3][3],C[][]=new int[3][3];
        int i,j,k;
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
        System.out.println("Multiplication is");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                C[i][j]=0;
                {
                    for(k=0;k<3;k++)
                    {
                        C[i][j]=C[i][j]+A[i][k]*B[k][j];
                    }
                    System.out.print(C[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
