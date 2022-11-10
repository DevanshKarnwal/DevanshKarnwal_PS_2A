import java.util.Scanner;
public class D5Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,temp=0;
        System.out.println("Enter number of terms");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter terms");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++)
        {
            temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
