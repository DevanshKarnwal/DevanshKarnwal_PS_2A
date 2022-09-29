import java.util.*;
public class D4Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,s=0;
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=1;i<=a*b;i++)
        {
            if(i%a==0&&i%b==0)
            {
                s=i;
                break;
            }
        }
        System.out.println("The LCM is "+s);
    }
}
