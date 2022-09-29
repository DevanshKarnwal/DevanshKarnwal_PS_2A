import java.util.*;
import java.math.*;
import java.lang.*;
public class cuboid {
    public static void main(String[] args) {
        int l,b,h,a;
        System.out.println("enter length , breadth and height");
        Scanner s=new Scanner(System.in);
        l=s.nextInt();
        b=s.nextInt();
        h=s.nextInt();
        a = 2*(l*b+b*h+h*l);
        System.out.println("the total area is "+a);
    }
}
