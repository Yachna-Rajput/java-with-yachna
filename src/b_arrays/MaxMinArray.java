package b_arrays;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elemnets of array : ");
        for(int i =0 ; i<size ; i++) {
            System.out.println("Elemeny " + i + " is : ");
            array[i] = sc.nextInt();
        }

            int max = array[0];
            int min = array[0];

            for(int i = 1 ;  i < size  ; i++){
                if(array[i] > max){
                    max = array[i];

                }
                if(array[i] < min){
                    min = array[i];
                }
            }
            System.out.println("Maximum number is : "+max);
            System.out.println("Minimum number is : "+min);

            }

        }
