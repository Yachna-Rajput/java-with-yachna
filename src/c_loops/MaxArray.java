package c_loops;

import b_arrays.ArrayUtility;

public class MaxArray {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();

        int max = Integer.MIN_VALUE;
        for(int num : array){
            if(max < num){
                max = num;
            }
        }
        System.out.println("Maximum number is " +max);

    }
}
