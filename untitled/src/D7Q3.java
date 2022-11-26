import java.util.Scanner;
public class D7Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=new String();
        System.out.println("Enter a string");
        s=sc.next();
        int flag=0;
        char c[]=s.toCharArray();
        for(int i=0;i<s.length()/2;i++){
            if(c[i]!=c[s.length()-i-1])
            {
                flag=1;
            }
        }
        if(flag==1)
            System.out.println("Not palindrome");
        else
            System.out.println("Palindrome");
    }
}
