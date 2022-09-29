import java.util.*;
public class D4Q1 {
    public static void main(String[] args) {
        int s=0,n,a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        b=n;
        while(n>0)
        {
            a=n%10;
            s=s*10+a;
            n=n/10;
        }
        if(s==b)
        System.out.println("number is palindrome");
        else
            System.out.println("Not palindrome");
    }
}
