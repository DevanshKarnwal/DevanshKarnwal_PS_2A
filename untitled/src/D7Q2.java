import java.util.Scanner;
public class D7Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=new String();
        System.out.println("Enter a string");
        s=sc.next();
        char a;
        char c[]=s.toCharArray();
        for(int i=0;i<s.length()/2;i++)
        {
            a=c[i];
            c[i]=c[s.length()-i-1];
            c[s.length()-i-1]=a;
        }
        s=String.valueOf(c);
        System.out.println(s);
    }
}
