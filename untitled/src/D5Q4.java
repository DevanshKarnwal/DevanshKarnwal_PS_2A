import java.util.*;
public class D5Q4 {
    static int digit(int n)
    {
        int s1=0;
        while(n>0)
        {
            n=n/10;
            s1=s1+1;
        }
        return s1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k,s,z,flag=0;
        System.out.println("Enter number of terms and value of k");
        n=sc.nextInt();
        k=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter elements in array");
        for (int i=0;i<n;i++){
            A[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            if(A[i]<k)
            {
                int a;
                z=A[i];
                s=digit(A[i]);
                int C[]=new int[s];
                int B[]=new int[s-1];
                int counter=0;
                while(A[i]>0)
                {
                    a=A[i]%10;
                    C[counter]=a;
                    counter++;
                    A[i]=A[i]/10;
                }
                for(int o=0;o<s-1;o++)
                {
                    B[o]=C[o]-C[o+1];
                }
                for(int y:B)
                {
                    if(y==1||y==-1)
                    {
                        flag++;
                    }
                }
                if(counter==flag+1)
                    System.out.println(z);
                flag=0;
            }
            else
                continue;
        }
    }
}