import java.util.*;
public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 number");
        int a,b;
        a1:
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("enter your choice from below options");
        System.out.println("Enter add for addition");
        System.out.println("Enter sub for substraction");
        System.out.println("Enter mul for multiplication");
        System.out.println("Enter div for division");
        sc.nextLine();
        String s=sc.nextLine();
        switch(s)
        {
            case "add" :
                System.out.println(a+b);
                break;
            case "sub":
                System.out.println(a-b);
                break;
            case "mul":
                System.out.println(a*b);
                break;
            case "div":
                System.out.println(a/b);
                break;
            default:
                System.out.println("enter valid");
        }
    }
}
