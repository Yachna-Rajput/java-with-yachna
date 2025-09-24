package b_arrays;

import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        for (int i = 0; i <= size; i++) {
            System.out.println("Element " + i + " :");
            array[i] = sc.nextInt();
        }
        return array;
    }
}
