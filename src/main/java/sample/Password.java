package sample;

public class Password {
    String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static boolean alphabetCheck(String password){
        return password.matches((".*[a-zA-Z]+.*"));
    }

    public static boolean numCheck(String password){
        return password.matches(".*[0-9]+.*");
    }

    public static boolean specCheck(String password){
        return password.matches(".*[*^&@!]+.*");
    }
    public static boolean emptyCheck(String password){
        return !password.isBlank();
    }
}
