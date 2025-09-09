package b_arrays;

import java.util.Scanner;

public class IsSortedArray {


    public static boolean isIncreasing(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }


    public static boolean isDecreasing(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + " :");
            array[i] = sc.nextInt();
        }

        boolean isInc = isIncreasing(array);
        boolean isDec = isDecreasing(array);


        if (isInc) {
            System.out.println("Array is sorted in Ascending order");
        } else if (isDec) {
            System.out.println("Array is sorted in Decreasing order");
        } else {
            System.out.println("Array is Not sorted");

        }
    }
}


