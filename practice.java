import java.util.*;
public class practice
{
    public static void main(String[] args) {
         //practice
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the tempreture in youe city");
         int temp = sc.nextInt();
         if(temp < 0 )
            System.out.println("wea freezing cold in your city");
         else if(temp <= 15 )
            System.out.println("Its cold in your city");
         else if(temp <= 25 )
            System.out.println("");
         else if(temp <= 35 )
            System.out.println("Its freezing cold inyour city");
    }
}
