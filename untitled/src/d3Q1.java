import java.util.*;
public class d3Q1 {
    public static void main(String[] args) {
        int n,i,j,s=1,a=0;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                s=s*j;
            }
            a=a+s;
            s=1;
        }
        System.out.println("sum is "+a);
    }
}
