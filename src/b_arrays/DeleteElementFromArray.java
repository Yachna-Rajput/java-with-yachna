package b_arrays;

import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Array  deletion");
        int[] array = ArrayUtility.inputArray();
        System.out.println("Enter the element which you want to delete : ");
        int numToDelete = sc.nextInt();
        int[] newArray = deleteNumber(array, numToDelete);
        System.out.println("Here is your new Array ");
        ArrayUtility.displayArray(newArray);
    }


    public static int[] deleteNumber(int[] array, int numToDelete) {
        // Step 1: Count how many times num occurs
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numToDelete) {
                count++;
            }
        }

        // If not found, return same array6
        if (count == 0) {
            System.out.println("Number not found!");
            return array;
        }

            int newSize = array.length - count;
            int[] newArray = new int[newSize];




             int j =0;
            for (int i = 0 ; i < array.length; i++) {
                if (array[i] != numToDelete) {
                    newArray[j] = array[i];
                    j++;

                }
            }

            return newArray;
        }
    }
