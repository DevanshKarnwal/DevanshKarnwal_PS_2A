import java.util.Scanner;
import java.lang.*;
public class D7Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        int count=0;
        for(char c:s.toCharArray()){
            if(Character.isSpaceChar(c))
                count++;
        }
        char d[]=new char[count];
        count=0;
        for(char c:s.toCharArray()){
            if(Character.isSpaceChar(c))
                continue;
            else{
                d[count]=c;
                count++;
            }
        }

        System.out.println(String.valueOf(d));
    }
}
