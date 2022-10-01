import java.util.*;
public class D4Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,z,a=0,b=0;
        System.out.println("Enter position of cat 1 ");
        x=sc.nextInt();
        System.out.println("Enter position of cat 2 ");
        y=sc.nextInt();
        System.out.println("Enter position of mouse ");
        z=sc.nextInt();
        while(x!=z)
        {
            if(x<=z)
            {
                x++;
                a++;
            }
            else
            {
                x--;
                a++;
            }
        }
        while(y!=z)
        {
            if(y<=z)
            {
                y++;
                b++;
            }
            else
            {
                y--;
                b++;
            }
        }

        if(b>a)
            System.out.println("Cat 1");
        else if(a>b)
            System.out.println("Cat 2");
        else
            System.out.println("Mouse");
    }

}
