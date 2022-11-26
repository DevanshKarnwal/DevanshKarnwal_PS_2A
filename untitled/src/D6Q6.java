import java.util.Scanner;
public class D6Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1");
        String s1=sc.next();
        System.out.println("Enter string 2");
        String s2=sc.next();
        int c[]=new int[27];
        int count=0;
        for(int i=0;i<27;i++)
        {
            c[i]=0;
        }
        for(int i=0;i<s1.length();i++)
        {
            int a=(int)(s1.charAt(i));
            a=a-97;
            c[a]=1;
        }
        for(int i=0;i<s2.length();i++)
        {
            int a=(int)(s2.charAt(i));
            a=a-97;
            c[a]++;
        }
        for(int i=0;i<26;i++)
        {
            char z=0;
            if(c[i]==1)
                count++;
        }
        System.out.println("The number of changes are "+count);
    }
}
