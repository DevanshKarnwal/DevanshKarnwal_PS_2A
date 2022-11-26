import java.util.Scanner;
public class D7Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[128];
        for(int i=0;i<128;i++)
            a[i]=0;
        System.out.println("Enter a string");
        String s= sc.next();
        for(int i=0;i<s.length();i++){
            int c=(int)(s.charAt(i));
            a[c]++;
        }
        for(int i=0;i<128;i++){
            int j=a[i];
            if(j!=0)
            {
                System.out.println("The count of character "+(char)(i)+" is "+j);
            }
        }
    }
}
