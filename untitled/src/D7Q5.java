import java.util.Scanner;
public class D7Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter a string");
        s = sc.nextLine();
        char a[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            char c=a[i];
            if(Character.isUpperCase(c))
                a[i]=Character.toLowerCase(c);
            else if (Character.isLowerCase(c))
                a[i]=Character.toUpperCase(c);
            System.out.print(a[i]);
        }

    }
}
