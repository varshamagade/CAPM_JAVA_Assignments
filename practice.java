import java.util.*;
import java.io.Console;
public class practice {
   public static void main(String[] args) {
      // practice
      Scanner sc = new Scanner(System.in);
      int Choice;
      do {
         System.out.println("Practice Assignemnts");
         System.out.println("A. Temperature Classifier");
         System.out.println("B. Day Type using Switch");
         System.out.println("C. Login Validator");
         System.out.println("D. BMI Calculator");
         System.out.println("E. Multiplication Tables");
         System.out.println("F. Number Guessing Game");
         System.out.println("G. Sum of Digits");
         System.out.println("H. Number Triangle");
         System.out.println("0. Exit");
         System.out.print("Enter your choice: ");
         Choice = sc.nextInt();
         switch (Choice) {
            case 'A':
               System.out.println("Enter the tempreture in your city");
               int temp = sc.nextInt();
               if (temp < 0)
                  System.out.println("weather freezing cold in your city");
               else if (temp <= 15)
                  System.out.println("weather cold in your city");
               else if (temp <= 25)
                  System.out.println("weather is pleasant in your city");
               else if (temp <= 35)
                  System.out.println("weather is hot in your city");
               else if (temp > 36) {
                  System.out.println("weather is extramly hot in your city");
               }
               break;
            case 'B':
               System.out.println("Enter which day : ");
               int day = sc.nextInt();

               if (day > 7) {
                  System.out.println("invalid input ");
               } else {
                  switch (day) {
                     case 1:
                        System.out.println("WeekDay - Monday ");
                        break;
                     case 2:

                        System.out.println("WeekDay - Tuesday ");
                        break;
                     case 3:

                        System.out.println("WeekDay - Wednesday ");
                        break;
                     case 4:

                        System.out.println("WeekDay - Thursday ");
                        break;
                     case 5:

                        System.out.println("WeekDay - friday ");

                     case 6:

                        System.out.println("Weekend -saturday ");
                        break;
                     case 7:

                        System.out.println("Weekend -  sunday ");
                        break;
                     default:
                        break;
                  }
               }
            case 'C':
               Console console = System.console();
               String validUsername = "admin";
                String validPassword = "1234";

               System.out.println("Welcome Enter your login deatils : ");
               System.out.println("Username");
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
               break;
            case 'D':
               break;
            case 'E':
               break;
            case 'F':
               break;
            case 'G':
               break;
            case 'H':
               break;
            case 0:
               System.out.print("Thank you!! ");
               break;
            default:
               System.out.print("Invalid Choice ");
               break;
         }
      } while (Choice != 0);

      sc.close();
   }
}
