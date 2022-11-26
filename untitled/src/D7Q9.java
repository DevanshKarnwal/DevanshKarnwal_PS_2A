import java.util.Scanner;
import java.io.*;
public class D7Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.next();
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter a array");
        String a[]=new String[n];
        for(int i=0;i<n;i++){
            a[i]=sc.next();
        }
        int j=0,k=0,count=0,flag=0;
        for(int i=0;i<n;i++){
            int f=s.length()-1;
            String b=a[i];
            char c[]=b.toCharArray();
            k=b.length()-1;
            j=s.length()-1;
            if(c[k]==s.charAt(j)) {
                for (int y = b.length()-1;y>=0; y--) {
                    if(c[y]==s.charAt(f))
                    {
                        flag++;
                        f--;
                    }
                    }
                if(flag==b.length()){
                    count++;
                }
                flag=0;
            }
        }
        System.out.println("The no. of suffix are "+count);
    }
}
