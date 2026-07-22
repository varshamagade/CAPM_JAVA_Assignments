import java.util.*;

public class practice_task2 {
   public static void main(String[] args) {
      // Inputs
      Scanner sc = new Scanner(System.in);
      /*byte b = 120;
      int i = 1234;
      char c = 'd';
      long l = 1233456789975L;
      double d = 23114222.444;
      float f = 2.34f;

      //System.out.println(b + "," + i + "," + c + "," + l + "," + d + "," + f);
      */
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

      sc.close();
   }

}
