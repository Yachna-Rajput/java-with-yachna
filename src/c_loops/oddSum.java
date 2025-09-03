package c_loops;

import java.util.Scanner;

public class oddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate the sum of  N odd numbers");
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int sum = 0;
        for(int i =1; i<=num ; i++){
            int odd = (2*i) -1;
            sum+=odd;
        }
        System.out.println("sum of first "+num + " odd numbers: " +sum);


    }
}
