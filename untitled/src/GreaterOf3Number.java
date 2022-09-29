import java.util.*;
public class GreaterOf3Number {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("enter 3 number ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>b)
        {
            if(c>a)
                System.out.println("c is greater "+c);
            else
                System.out.println("a is greater "+a);
        }
        else
        {
           if(c>b)
               System.out.println("c is greater "+c);
           else
               System.out.println("b is greater "+b);
        }
    }
}
