package a_basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate the simple interest");
        System.out.println("Enter the principle of S.I");
        int P = sc.nextInt();
        System.out.println("Enter the rate of S.I");
        float R = sc.nextFloat();
        System.out.println("Enter the time of S.I");
        float T = sc.nextFloat();
        float  SI = (P*R*T)/100;
        System.out.println("your S.I is : " +SI);


    }
}
