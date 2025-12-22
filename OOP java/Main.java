import java.util.*;
class ATM {
    // yahan hamne object ka blueprint define kiya
    private int __pin ;
    private int balance;
    
    // constructor
    ATM(int pin_passed,int balance) {
        this.__pin = pin_passed;
        this.balance = balance;
    }
    
    // yahan hum define kar rhe methods
    // 1. change the pin
    
    void change_pin ( int new_pin) {
        if(this.__pin == new_pin) {
            System.out.println("this is already an existing pin");
        }
        else {
            this.__pin = new_pin;
            System.out.println("pin updated");
        }
    }
    
    // 2. balance print karne ke liye
    void print_balance () {
        System.out.printf("your balance is %d", this.balance);
    }
    
    void deposit(int amt) {
        this.balance+=amt;
    }
    void withdraw (int amt) {
        this.balance-= amt;
    }
}
public class Main {
    public static void main(String[] args) {
        ATM a1 = new ATM(1234, 20000);

        Scanner sc = new Scanner(System.in);
        // System.out.println(a1.__pin);
        
        // a1.change_pin(1234,4567);
        // a1.print_balance();
        
        int choice = 0;
        while (choice != 5) {
            System.out.println("enter your choice");

            System.out.println("1. change the pin");
            System.out.println("2. print the balance");
            System.out.println("3. deposit");
            System.out.println("4. withdraw");

            System.out.println("5. exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    
                    System.out.println("enter new pin");

                    int new_pin = sc.nextInt();
                    a1.change_pin( new_pin);

                    break;
                case 2:
                    a1.print_balance();
                    break;
                case 3:
                    System.out.println("enter amount to deposit");
                    int amt_deposit = sc.nextInt();

                    a1.deposit(amt_deposit);
                    break;
                case 4:
                    System.out.println("enter amount to withdraw");
                    int amt_withdraw = sc.nextInt();
                    
                    a1.withdraw(amt_withdraw);
                    break;
                case 5:
                    System.out.println("exiting...");
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }
    }
}