import javax.swing.plaf.IconUIResource;
import java.util.Scanner;
public class D7Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter a string");
        s = sc.nextLine();
//        int a=0;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c == ' ')
//                a = a - 1;
//            else
//                a=a+1;
//
//        }
//        System.out.println(a);
        int count =0;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(Character.isAlphabetic(a))
                count++;
        }
        System.out.println(count);
    }
}
