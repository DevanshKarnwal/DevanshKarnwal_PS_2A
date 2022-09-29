import java.util.*;
public class InsertInArray {
    public static void main(String[] args){
        int A[]=new int[10];
        System.out.println("enter number of terms");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("enter a element to add and index");
        int e,j;
        e=sc.nextInt();
        j=sc.nextInt();
        System.out.println("Array is");
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
        for(int i=n;i>=j;i--)
        {
            A[i+1]=A[i];
        }
        A[j]=e;
        System.out.println("the new array is");
        for(int i=0;i<n+1;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
}
