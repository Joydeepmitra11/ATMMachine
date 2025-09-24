import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine");
        double balance = 100000.0;
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Choose any operation you want to perform");
            System.out.println("1. Check balance:");
            System.out.println("2. Deposit amount");
            System.out.println("3. Withdraw amount");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your balance is ₹ " + balance);
                    break;
                case 2:
                    System.out.println("Enter amount you want to deposit");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Deposited successfully.New balance: ₹" + balance);
                    break;
                case 3:
                    System.out.println("Enter amount you want to withdraw");
                    int withdraw = sc.nextInt();
                    balance -= withdraw;
                    System.out.println("Withdrawn successfully. New balance: ₹" +balance);
                    break;
                case 4:
                    System.out.println("Thank you for choosing Light ATM, See you again!");
                    isRunning = false;
                    break;
                default:
                    System.out.println(" Invalid option, Choose from the given option");
            }
        }
        sc.close();
    }
}


