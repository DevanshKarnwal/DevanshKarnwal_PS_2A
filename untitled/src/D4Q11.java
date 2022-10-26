import java.util.*;
public class D4Q11 {
    static void fibbo(int n,int b,int c){
        if(n==1)
            System.out.print(b);
        else
            fibbo(n-1,c,b+c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        fibbo(a,0,1);
    }
}
