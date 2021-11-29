package sample;

public class Username {

    public static boolean alphabetCheck(String username) {
        return username.matches((".*[a-zA-Z]+.*"));
    }

    public static boolean atCheck(String username) {
        return username.contains("@");
    }

    public static boolean dotcomCheck(String username) {
        return username.contains(".com");
    }

    public static boolean emptyCheck(String username) {
        return !username.isBlank();
    }


}
