import java.util.Scanner;

public class BankAccountSimulator {
    public static void main(String[] args) {
        //input from the user 
        Scanner sc = new Scanner(System.in);
        String accountHolder;
        int accountNumber = 1001;
        double balance;
        int Choice;

        System.out.println("Enter Account Holder Name");
        accountHolder = sc.next();

        System.out.println("Enter Account Number");
        accountNumber = sc.nextInt();

        System.out.print("Enter Initial Balance: ");        
        balance = sc.nextDouble();
        
        do{
            System.out.println("====Bank Menu====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            Choice = sc.nextInt();
g
            switch (Choice) {
                case 1:
                    //Deposit
                    System.out.print("Enter amount you wish to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.printf("Deposited: %.2f%n", deposit);
                    System.out.printf("Current Balance: %.2f%n", balance);
                    break;
                case 2:
                    //Deposit
                    System.out.print("Enter amount you wish withdrawn: ");
                    double Withdrawl = sc.nextDouble();

                    if (Withdrawl < balance) {
                    balance -= Withdrawl;
                    System.out.printf("Withdrawl: %.2f%n", Withdrawl);
                    System.out.printf("Current Balance: %.2f%n", balance);
                    break;
                    }
                    else if (Withdrawl > balance) {
                        System.out.printf("Insufficient balance!!");
                        break;
                    }
                case 3:
                    System.out.printf("Current Balance: %.2f%n", balance);
                    break;
                case 0:
                      // Step 6: Exit
                      System.out.println("\nThank you, " + accountHolder + "for banking with us");
               
                    break;
            
                default:
                    System.out.print("Invalid Choice ");
                    break;
            }
        }while (Choice != 0);
      sc.close();
    }
    
}
