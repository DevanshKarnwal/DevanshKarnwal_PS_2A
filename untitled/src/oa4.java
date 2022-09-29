import java.util.*;
import java.lang.*;
import java.math.*;
public class oa4 {
    public static void main(String[] args) {
        int a,b,c;
        float r1,r2,d;
        System.out.println("enter value of a,b,c");
        Scanner s=new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = (float)(Math.sqrt(b*b-4*a*c));
        r1 = (float)((-b+d)/(2*a));
        r2 = (float)((-b-d)/(2*a));
        System.out.println("the roots are ");
        System.out.println(r1);
        System.out.println(r2);

    }
}
