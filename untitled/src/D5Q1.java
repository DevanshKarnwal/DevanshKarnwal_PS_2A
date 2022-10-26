import java.util.*;
public class D5Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter number of terms");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter terms");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        int i=0,j=n-1,c=0;
        while (i<=j)
        {
            if(A[i]>A[j])
            {
                c=A[j];
                i++;
            }
            else
            {
                c=A[i];
                j--;
            }
        }
        System.out.println(c);
    }
}
