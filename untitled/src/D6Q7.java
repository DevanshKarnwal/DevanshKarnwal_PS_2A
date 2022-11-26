import java.util.*;
public class D6Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter an array of integer");
        for(int i=0;i<n;i++)
            a[i]= sc.nextInt();
        int ans=0;
        for(int i=0;i<n;i++)
            a[i]= Integer.parseInt(Integer.toBinaryString(a[i]));
        for(int i=0;i<n;i++){
            ans ^=a[i];
        }
        System.out.println("answer is "+ans);
    }
}

