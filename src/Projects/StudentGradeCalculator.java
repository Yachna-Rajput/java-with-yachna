import java.util.Scanner;

public class StudentGradeCalculator {

    // Method to calculate percentage
    public static double calculatePercentage(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marks.length;
    }

    // Method to assign grade
    public static char calculateGrade(double percentage) {
        if (percentage >= 90) return 'A';
        else if (percentage >= 75) return 'B';
        else if (percentage >= 50) return 'C';
        else return 'D';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
        }

        double percentage = calculatePercentage(marks);
        char grade = calculateGrade(percentage);

        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}

