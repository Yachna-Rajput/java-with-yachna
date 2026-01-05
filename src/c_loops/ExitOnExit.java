package c_loops;

import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your  command :");
            String command = sc.nextLine();
            if (command.equals("Exit")) {
                break;
            }
        }
        System.out.println("You have successful exited");
    }
}





