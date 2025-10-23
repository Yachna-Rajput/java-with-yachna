package b_arrays;

import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        for (int i = 0 ; i < size; i++) {
            System.out.print("Element " + (i+1) + " :");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int[][] input2DArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the Number of Columns :");
        int columns = sc.nextInt();

        int[][] array = new int[rows][columns];

        for (int i = 0 ; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element of rows " + (i + 1) + " and column " + (j + 1) + " is : ");
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }

    public static void displayArray(int[] array ){
        for(int i =0; i< array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
}