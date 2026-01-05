package e_classesAndObjects;

import java.util.Scanner;

public class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();
        String result = marks > 80 ? "High " : (marks > 50 ? "Moderate" : "Low");
        System.out.println("Result is : " + result);
    }

}
