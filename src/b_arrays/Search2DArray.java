package b_arrays;

import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        System.out.println("Search the element in 2D array ");
        Scanner sc = new Scanner(System.in);
        int[][] arr = ArrayUtility.input2DArray();
        System.out.print("Enter the  element which you want to find : ");
        int num = sc.nextInt();
        boolean isFound = search(arr, num);
        if (isFound) {
            System.out.println("Your Number  is found ");
        } else {
            System.out.println("Your Number is not found");
        }
    }

    public static boolean search(int[][] arr, int num) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }
}



