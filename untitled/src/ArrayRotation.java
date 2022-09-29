import java.util.*;
public class ArrayRotation {
    public static void main(String[] args) {
        int A[]=new int[10];
        Scanner sc=new Scanner(System.in);
        int i,temp;
        System.out.println("enter elements");
        for(i=0;i<A.length;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("entered array is");
        for(i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        temp=A[0];
        for(i=0;i<A.length-1;i++)
        {
            A[i]=A[i+1];
        }
        A[9]=temp;
        System.out.println("new array is");
        for(i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
}
