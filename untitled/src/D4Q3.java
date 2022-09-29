import java.util.*;
public class D4Q3 {
    static int fact(int n)
    {
        if (n==0)
            return 1;
        else if(n==1)
            return 1;
        else
            return(n*fact(n-1));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,z;
        System.out.println("Enter a number ");
        a=sc.nextInt();
        z=fact(a);
        System.out.println("The factorial is "+z);
    }
}
