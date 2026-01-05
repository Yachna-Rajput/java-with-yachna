package c_loops;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("check the Password valid or not");
        String Password;
        do{
            System.out.print("Enter your password :");
             Password = sc.nextLine();
        }while (isPasswordValid( Password));
        System.out.println("Your Password is valid");


    }
     public static boolean isPasswordValid(String Password){
        return Password.length()>6;

    }
}
