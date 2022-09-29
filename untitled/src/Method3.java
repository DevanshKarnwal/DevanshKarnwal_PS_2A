import java.util.*;
public class Method3 {
    static int area(int l,int b)
    {
        int a;
        a=l*b;
        return a;
    }
    static int area(int r)
    {
        int a;
        a= (int)(Math.PI*r*r);
        return a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c;
        System.out.println("enter 1 for rectangle and 2 for circle");
        c=sc.nextInt();
        System.out.println("enter Length and bredth for rectangle and radius for circle");
        if(c==1)
        {
            int l = sc.nextInt();
            int b = sc.nextInt();
            int z1 = area(l, b);
            System.out.println(z1);
        }
        else {
            int r = sc.nextInt();
            int z2 = area(r);
            System.out.println(z2);
        }
    }

}
