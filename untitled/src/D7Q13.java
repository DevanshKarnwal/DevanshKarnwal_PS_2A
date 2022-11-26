import java.util.Scanner;
public class D7Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter number of words");
        n=sc.nextInt();
        String s[]=new String[n];
        System.out.println("Enter words");
       for(int i=0;i<n;i++){
           String str=sc.next();
           s[i]=str;
       }
       for(int i=0;i<n-1;i++){
          for(int j=i+1;j<n;j++){
              int b=0;
              b=s[i].compareTo(s[j]);
              if(b>0){
                  String c=s[i];
                  s[i]=s[j];
                  s[j]=c;
              }
              else
                  continue;
          }
       }
       for(String c:s)
           System.out.println(c);
    }
}
