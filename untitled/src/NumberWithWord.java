import java.util.*;
public class NumberWithWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,n,s=0,b=0;
        System.out.println("enter a number");
        n=sc.nextInt();
        while(n>0)
        {
            b=n%10;
            s=s*10+b;
            n=n/10;
        }
        while(s>0)
        {
            a=s%10;

                {
                    if(a==1)
                        System.out.print("One ");
                    else if (a==2)
                        System.out.print("Two ");
                    else if (a==3)
                        System.out.print("Three ");
                    else if (a==4)
                        System.out.print("Four ");
                    else if (a==5)
                        System.out.print("Five ");
                    else if (a==6)
                        System.out.print("Six ");
                    else if (a==7)
                        System.out.print("Seven ");
                    else if (a==8)
                        System.out.print("Eight ");
                    else if (a==9)
                        System.out.print("Nine ");
                    else
                        System.out.print("Zero ");
                }
                s=s/10;
        }
    }
}
