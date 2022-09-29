import java.util.*;
public class array1 {
    public static void main(String[] args) {
        int A[]=new int[5];
        System.out.println("enter elements");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            A[i]=sc.nextInt();
        }

        for(int x:A)
        {
            System.out.println(x);
        }
    }
}
