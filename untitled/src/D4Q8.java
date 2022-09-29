import java.util.Scanner;

public class D4Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,s=0;
        System.out.println("Enter two numbers ");
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=1;i<a&&i<b;i++)
        {
            if(a%i==0&&b%i==0)
            {
                s=i;
            }
        }
        System.out.println("The hcf of two numbers are "+s);
    }
}
