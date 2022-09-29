import java.util.*;
public class TwoDArray1 {
    public static void main(String[] args) {
        int A[][]=new int[3][3];
        System.out.println("enter elements ");
        int i,j;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("the matrix is ");
        i=0;j=0;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
