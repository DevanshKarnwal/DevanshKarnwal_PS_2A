public class StudentChallenge3 {
    public static void main(String[] args) {
        String str = "a!b@c#1$2%3";
        System.out.println(str.replaceAll("[^a-z0-9]",""));
        String str1 = "abc     de           f";
        String str2 = "ab vf hg";
        System.out.println(str1.replaceAll("\\s+"," "));
        System.out.println(str2.split("\\s"));
    }
}
