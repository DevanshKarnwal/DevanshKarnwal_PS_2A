import java.util.*;
public class D3Q8 {
    public static void main(String[] args) {
        int n,s=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s=s+i*(i+1)*(i+2);
        }
        System.out.println("The sum is "+s);
    }
}
