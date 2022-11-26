import java.util.Scanner;
import java.lang.*;
public class D7Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1");
        String s1=sc.next();
        System.out.println("Enter string 2");
        String s2=sc.next();
        int flag=0;
        //  for case sensitive
//        for(int i=0,j=0;i<s1.length()&&j<s2.length();i++,j++){
//            if(s1.charAt(i)!=s2.charAt(j))
//                flag++;
//        }
        // for case insensitive
        for(int i=0,j=0;i<s1.length()&&j<s2.length();i++,j++){
            char a=s1.charAt(i),b=s2.charAt(j);
            if(a==Character.toLowerCase(b)||a==Character.toUpperCase(b))
                continue;
            else
                flag++;
        }
        if (flag!=0)
            System.out.println("not equal");
        else
            System.out.println("Equal");
    }
}
