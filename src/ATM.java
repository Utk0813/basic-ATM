import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.*;

public class ATM {
    float balance;
    int Pin=5678;

    public void checkPin() {
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if (enteredPin == Pin) {
            menu();
        } else {
            System.out.println("Please enter a valid Pin");
            menu();
        }
    }

        public void menu() {
            System.out.println("Enter what you wish to check: ");
            System.out.println("1.Check Balance");
            System.out.println("2.Withdraw Money");
            System.out.println("3.Deposit Money");
            System.out.println("4.EXIT");

            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();

            if (opt == 1) {
                CheckBalance();
            }
            else if (opt == 2) {
                WithdrawMoney();
            }
            else if (opt == 3) {
                DepositMoney();
            }
            else if (opt == 4) {
                return;
            }
            else {
                System.out.println("Please enter a valid choice");
                menu();
            }
        }

        public void CheckBalance(){
            System.out.println("Balance: " + balance);
            menu();
        }
        public void WithdrawMoney(){
            System.out.println("Enter the amount you wish to withdraw: ");
            Scanner sc=new Scanner(System.in);
            float amount=sc.nextFloat();
            if(amount>balance) {
                System.out.println("You have insufficient funds: ");
            }
            else {
                balance = balance - amount;
                System.out.println("Money withdrawl successful");
                System.out.println("The remaining balance is: " + balance);
            }
            menu();
        }
        public void DepositMoney(){
            System.out.println("Enter the amount you wish to deposit: ");
            Scanner sc=new Scanner(System.in);
            float depositAmount=sc.nextFloat();
            balance=balance+depositAmount;
            System.out.println("Money deposited successfully");
            System.out.println("The final balance is: " + balance);
            menu();
        }

    }
