import java.util.*;
public class helloworld
{
   public static void main(String[] args){
   //Inputs
      Scanner sc = new Scanner(System.in);
    System.out.println("Hello World");
   
    byte b = 120;
    int  i= 1234;
    char c = 'd';
    long l = 1233456789975L;
    double d = 23114222.444;
    float f = 2.34f;
    
    System.out.println(b + ","+ i + "," + c + "," + l + "," + d  + "," + f);

    System.out.println("Enter which day : ");
    int day = sc.nextInt();

    if(day > 7)
    {
          System.out.println("invalid input ");
    }
    else
    {
        switch (day) {
            case 1:
                
               System.out.println("Monday "); 
               break;
            case 2:
                
               System.out.println("Tuesday "); 
               break;
            case 3:
                
               System.out.println("Wednesday "); 
               break;
            case 4:
                
               System.out.println("Thursday "); 
               break;
             case 5:
                
               System.out.println("friday "); 

            case 6:
                
               System.out.println("saturday "); 
               break;
             case 7:
                
               System.out.println("sunday "); 
               break;
        
            default:
                break;
        }
    }

    sc.close();
    } 
}
