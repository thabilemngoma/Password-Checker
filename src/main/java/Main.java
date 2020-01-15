import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password;
        Scanner input = new Scanner (System.in);
        System.out.println("Please Enter Password");
        password = input.next();

        PasswordChecker passwordchecker = new PasswordChecker();
        passwordchecker.passwordIsValid(password);
    }
}
