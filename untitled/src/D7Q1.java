import java.util.Scanner;
public class D7Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=new String();
        System.out.println("Enter a string");
        s=sc.next();
        int count=0;
        int i=0;
//        for(i=0;s.charAt(i)!='\0';i++)
        for (char c:s.toCharArray())
        {
            count=count+1;

        }
        System.out.println("the length is "+count);

    }
}
