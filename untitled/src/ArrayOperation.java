import java.util.*;
public class ArrayOperation {
    public static void main(String[] args) {
        int A[]=new int[10];
        int s=0,max=0,b;
        max=A[0];
        System.out.println("enter elements");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<A.length;i++)
        {
            A[i]=sc.nextInt();
            s=s+A[i];
        }
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max)
                max=A[i];
        }
        int flag=0;
        System.out.println("enter a element to search");
        b=sc.nextInt();
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==b) {
                flag = 1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("element found");
        }
            else {
            System.out.println("Element not found");
        }
         System.out.println("Max is "+max);
         System.out.println("the sum is "+s);
         int max1=A[0],max2=A[0];
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max1)
            {
                max2 = max1;
                max1 = A[i];
            }
            else if(A[i]>max2)
                max2=A[i];
        }
        System.out.println("second max is "+max2);
    }

}
