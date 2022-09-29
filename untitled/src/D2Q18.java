public class D2Q18 {
    public static void main(String[] args) {
        String s="hello";
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(".");
            }
            for(int k=i;k<s.length();k++)
            {
                System.out.print(s.charAt(k));
            }
            System.out.println();
        }
    }
}
