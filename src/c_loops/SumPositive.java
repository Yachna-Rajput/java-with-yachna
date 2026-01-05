package c_loops;

import b_arrays.ArrayUtility;

import java.util.Scanner;

public class SumPositive {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();
        int sum = 0;
        for( int element : array){
            if(element < 0){
                continue;
            }
            sum+=element;

        }
        System.out.println("The sum of postive number is :"+sum);


        }
    }

