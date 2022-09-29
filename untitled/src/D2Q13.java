import java.util.*;
import java.lang.*;
public class D2Q13 {
    static void dec(int x,int y,int z)
    {
        int a=y;
       if(x>0&&z==0)
       {
           System.out.print(x+" ");
           dec(x-5,a,z);
       }
       z++;
        System.out.print(x+" ");
       if(x<a)
       {
           dec(x+5,a,z);
           System.out.print(x+" ");
       }
       System.exit(0);
    }

    public static void main(String[] args) {
       int n,b,z=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        b=n;
        dec(n,b,z);
    }
}
