package coreconcepts;

public class Regex {

    public static void main(String[] args) {
        String s = "(817) 958-5224";
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
    }
}
