import java.util.*;
public class D4Q10 {
    static int power(int a,int b)
    {
        if(b==0) {
            return 1;
        }
        else if(b%2==0) {
            return (power(a, b / 2) * power(a, b / 2));
        }
        else {
            return(a*power(a,b/2)*power(a,b/2));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number and power");
        int n=sc.nextInt();
        int p=sc.nextInt();
        int c;
        c=power(n,p);
        System.out.println("The answer is "+c);

    }
}


