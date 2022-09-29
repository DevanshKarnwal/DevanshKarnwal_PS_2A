public class radix {
    public static void main(String[] args) {
        String str1= "0131111";
        if(str1.matches("[0-1]*"))
            System.out.println("binary 2");
        else if (str1.matches("[0-9]+"))
            System.out.println("decimal 10");
    }
}
