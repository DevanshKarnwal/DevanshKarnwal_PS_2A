import java.util.*;
import java.math.*;
public class oa3 {
    public static void main(String[] args) {
        int a,b,c;
        float s;
        double area;
        System.out.println("input a,b,c");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s = (a+b+c)/2f;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("the are is "+area);
    }
}
