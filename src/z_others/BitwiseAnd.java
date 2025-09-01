package z_others;

import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("showcasing Bitwise operator");
        System.out.print("Enter the first num");
        int first = sc.nextInt();
        System.out.println("Enter the second num");
        int second = sc.nextInt();
        int result = first & second;
        System.out.println("Result is " +result);
    }
}
