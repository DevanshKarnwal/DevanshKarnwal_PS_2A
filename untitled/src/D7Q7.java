import java.util.Scanner;
import java.lang.*;
public class D7Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1");
        String s1 = sc.next();
        System.out.println("Enter string 2");
        String s2 = sc.next();
        char a[]=new char[s1.length()+s2.length()];
        for(int i=0;i<s1.length();i++)
            a[i]=s1.charAt(i);
        for(int i=0;i<s2.length();i++)
            a[i+s1.length()]=s2.charAt(i);
        s1=String.valueOf(a);
        System.out.println(s1);
    }
}
