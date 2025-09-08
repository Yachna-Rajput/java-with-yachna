package b_arrays;

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate the sum and average of Array");
        System.out.print("Enter your size : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++){
            System.out.println("Element" + i + ": ");
            array[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + array[i];
        }
        double Average = (double)sum/array.length;
            System.out.println("sum of the array is : " +sum);
            System.out.println("Average of the array is : "+Average);
        }
    }

