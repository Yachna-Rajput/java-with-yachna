package Projects;

import java.util.Scanner;

public class BankAccountSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double balance = 1000;
        int choice;

        do {
            System.out.println("\n=== Bank Account Menu ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("current balance " +balance);
                    break;
                case 2 :
                    System.out.println("Enter the Deposit amount : ");
                    double deposit = sc.nextDouble();
                    balance+=deposit;
                    System.out.println("Deposited :" +deposit);
                    break;
                case 3 :
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();
                    if(balance>=withdraw){
                    balance-=withdraw;
                    System.out.println("Withdrew: " +withdraw);
                    }else {
                        System.out.println("Insufficient Balance !");

                    }
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
