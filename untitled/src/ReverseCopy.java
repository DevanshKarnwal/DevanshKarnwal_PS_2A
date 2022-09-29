import java.util.*;
public class ReverseCopy {
    public static void main(String[] args) {
        int A[]=new int[10],B[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of array");
        for(int i=0;i<A.length;i++)
        {
            A[i]=sc.nextInt();
        }
        int j=0;
        for(int i=A.length-1;i>=0;i--)
        {
            B[j]=A[i];
            j++;
        }
        System.out.println("Array B is");
        for(int i=0;i<B.length;i++)
        {
            System.out.print(B[i]+" ");
        }
    }
}
