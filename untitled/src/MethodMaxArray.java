import java.util.*;
public class MethodMaxArray {
    static int max(int a[])
    {
        int z;
        z=a[0];
        for(int i=0;i<10;i++)
        {
            if(z<a[i])
              z=a[i];
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements");
        int b[]=new int[10];
        for(int i=0;i<10;i++)
        {
            b[i]=sc.nextInt();
        }
        int m;
        m=max(b);
        System.out.println(" max is "+m);
    }
}
