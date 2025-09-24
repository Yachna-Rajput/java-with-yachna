package Projects;

import java.util.Scanner;

public class CalculatorApp {
    // File: CalculatorApp.java
    public static double add(double a, double b) {
    return a+b;
}
    public static double subtract(double a, double b) {
        return a-b;
    }
    public static double multiply(double a, double b) {
        return a*b;
    }
    public static double division(double a, double b) {
        return a/b;
    }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("=== Simple Calculator ===");
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;

            switch (operator) {
                case '+':
                    result = add(num1,num2);
                    break;
                case '-':
                    result = subtract(num1,num2);
                    break;
                case '*':
                    result = multiply(num1,num2);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = division(num1,num2);
                    } else {
                        System.out.println("Error: Division by zero!");
                        sc.close();
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
                    sc.close();
                    return;
            }

            System.out.println("Result: " + result);
            sc.close();
        }
    }


