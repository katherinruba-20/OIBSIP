import java.util.*;

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userId = 1234;
        int pin = 1111;

        int enteredId, enteredPin;
        double balance = 1000;
        String history = "";

        // Login
        System.out.print("Enter User ID: ");
        enteredId = sc.nextInt();

        System.out.print("Enter PIN: ");
        enteredPin = sc.nextInt();

        if (enteredId == userId && enteredPin == pin) {
            System.out.println("Login Successful!");

            while (true) {
                System.out.println("\n===== ATM MENU =====");
                System.out.println("1. Transaction History");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer");
                System.out.println("5. Exit");

                System.out.print("Choose option: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Transaction History:");
                        if (history.equals("")) {
                            System.out.println("No transactions yet.");
                        } else {
                            System.out.println(history);
                        }
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdraw = sc.nextDouble();

                        if (withdraw <= balance) {
                            balance -= withdraw;
                            history += "Withdraw: " + withdraw + "\n";
                            System.out.println("Withdraw successful!");
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                        break;

                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double deposit = sc.nextDouble();

                        balance += deposit;
                        history += "Deposit: " + deposit + "\n";
                        System.out.println("Deposit successful!");
                        break;

                    case 4:
                        System.out.print("Enter amount to transfer: ");
                        double transfer = sc.nextDouble();

                        if (transfer <= balance) {
                            balance -= transfer;
                            history += "Transfer: " + transfer + "\n";
                            System.out.println("Transfer successful!");
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                        break;

                    case 5:
                        System.out.println("Thank you for using ATM!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice!");
                }

                System.out.println("Current Balance: " + balance);
            }

        } else {
            System.out.println("Invalid Login!");
        }

        sc.close();
    }
} 
