import java.util.*;
public class D5Q3 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter terms");
        for (int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        int s1=0,s2=0;
        for(int i=0;i<n/2;i++)
        {
            s1=s1+A[i];
        }
        for(int i=n/2;i<n;i++)
        {
            s2=s2+A[i];
        }
        System.out.println("The multiplication of two sub arrays are " + s1*s2);
    }
}
