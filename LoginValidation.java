import java.util.Scanner;
import java.io.Console;
public class LoginValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Console console = System.console();

        String validUsername = "admin";
        String validPassword = "1234";

        System.out.println("Welcome /n Enter your login deatils : /n Username: ");
        String username = sc.next();
        char[] passwordChars = console.readPassword("Enter password: ");
        System.out.println(passwordChars);
        if (username.equals(validUsername) &&  String.valueOf(passwordChars).equals(validPassword)) {
             System.out.println("Login Successfully ");
        }
        else
        {
            System.out.println("Invalid credentials!! ");
        }
        sc.close();
    }
}