public class StudentChallenge2 {
    public static void main(String[] args) {

        String str = "hgfd2tr";
        System.out.println(str.matches("[0-9a-z]*"));
        String date = "10/10/2003";
        System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
}
