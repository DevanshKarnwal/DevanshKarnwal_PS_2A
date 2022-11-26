import java.util.Scanner;
public class D7Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s= sc.nextLine();
        int flag=0;

        String a[]={"auto","double","int","struct","break","else","long","switch","case","enum","register","typedef","char","extern","return","union","continue","for","signed","void","do","if","static","while","default","goto","sizeof","volatile","const","float","short","unsigned"};
        for(String b:a){
            if(b.equals(s)) {
                System.out.println("It is not an Identifier ");
                break;
            }
            else{
                if(Character.isDigit(s.charAt(0))){
                    flag=0;
                    break;
                }
                else if (s.startsWith("_")||Character.isAlphabetic(s.charAt(0))){
                    if(s.matches("[a-bA-z0-9_]*")||s.startsWith("_"))
                        flag=1;
                    else{
                        flag=0;
                        break;
                    }
                }
                else
                {
                    flag=0;
                    break;
                }
            }
        }
        if(flag==1)
            System.out.println("It is a identifier");
        else
            System.out.println("Not a identifier");
    }
}
