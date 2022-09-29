public class StrintMethods {
    public static void main(String[] args) {
        String str = "Java";
        int i =str.length();
        String str2 =str.toLowerCase();
        String str3 = "   abcdefghijk    ";
        str3 = str3.trim();
        String str4 = str3.substring(4,8);
        String str5 = str3.replace('e','k');
        System.out.println(str5);
    }
}
