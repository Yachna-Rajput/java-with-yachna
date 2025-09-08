package b_arrays;

import java.util.Scanner;

public class OccurrencesArray {
    public static void main(String[] args) {
        System.out.println("Calculate how many times number is occurrrd in Array");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + " :" + "  ");
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the number to find Occurrence");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == num) {
                count++;
            }
        }
        System.out.println(num + " occur " + count + " times in the array");
    }
}

