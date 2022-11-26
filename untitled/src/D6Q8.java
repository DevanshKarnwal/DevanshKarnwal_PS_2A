import java.util.Scanner;
public class D6Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string 1");
        String a =sc.next();
        System.out.println("Enter a string 2");
        String b =sc.next();
        int a1[]=new int[123];
        for(int i=0;i<123;i++) {
          a1[i]=0;
        }
        for(int i=0;i<a.length();i++){
            int j=(int)(a.charAt(i));
            a1[j]++;
        }
        for(int i=0;i<b.length();i++){
            int j=(int)(b.charAt(i));
            a1[j]++;
        }
        System.out.println("Repeted elements are");
        char z=0;
        for(int i=0;i<123;i++){
           if(a1[i]==2){
               z=(char)(i);
               System.out.print(z+" ");
           }
        }
        System.out.println();
        System.out.println("Non repeted elements are");
        for(int i=0;i<123;i++){
            if(a1[i]==1){
                z=(char)(i);
                System.out.print(z+" ");
            }
        }
    }
}
