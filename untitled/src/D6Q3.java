import java.util.Scanner;
public class D6Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,s=0,s1=0,s2=0,s3=0,flag=0;
        System.out.println("Enter order of square matrix");
        m=sc.nextInt();
        int a[][]=new int[m][m];
        System.out.println("Enter elements");
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        s=(m*(m*m+1))/2;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                s1=s1+a[i][j];
                s2=s2+a[j][i];
            }
            for(int y=0;y<m;y++)
            {
                for(int z=0;z<m;z++)
                {
                    if(y==z)
                    {
                        s3=s3+a[y][z];
                    }
                }
            }
            if(s1==s&&s2==s&&s3==s)
            {
                s1=0;
                s2=0;
                s3=0;
                flag=1;
                continue;
            }
            else
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
            System.out.println("Magic matrix");
        else
            System.out.println("Not a magic matrix");
    }
}
