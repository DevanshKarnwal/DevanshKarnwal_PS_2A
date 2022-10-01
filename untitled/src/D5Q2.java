import java.util.*;
public class D5Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,c=1,j,max=0,x=0,w;
        System.out.println("enter number of terms of array");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter numbers in array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        for(int i=0;i<=max;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[j]!=0)
                    a[j]=a[j]-1;
                //System.out.print(a[j]+" ");
                for(w=0;w<n;w++)
                {
                    if(a[w]==0)
                        x++;
                }
               // System.out.println();
                if(x==n)
                {
                    System.out.println(c);
                    System.exit(0);
                }
                x=0;
            }
            c++;

        }

    }
}
