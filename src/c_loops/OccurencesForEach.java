package c_loops;

import b_arrays.ArrayUtility;

import java.util.Scanner;

public class OccurencesForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = ArrayUtility.inputArray();
        System.out.println("Enter your number :");
        int element = sc.nextInt();
        int occ = countOccurences(array, element);
        System.out.println("your Number is occur " + occ + " times");
    }

    public static int countOccurences(int[] array, int element) {
        int occ = 0;
        for (int num : array) {
            if (element == num) {
                occ++;
            }
        }
        return occ;
    }
}
