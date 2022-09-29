import java.util.*;
public class D4Q7 {
    static void strong(int a)
    {
        int i,b,s1=0,s2=1,j,k;
        for(i=1;i<a;i++)
        {
            k=i;
            while(k>0)
            {
                b=k%10;
                for(j=1;j<=b;j++)
                {
                    s2=s2*j;
                }
                s1=s1+s2;
                k=k/10;
                s2=1;
            }
            if(s1==i)
                System.out.println(s1+" ");
            s1=0;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        strong(n);
    }
}

