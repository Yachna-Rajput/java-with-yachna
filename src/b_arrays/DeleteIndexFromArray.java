package b_arrays;

import java.util.Scanner;

public class DeleteIndexFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int size = sc.nextInt();

        int[] arr1 = new int[size];

        System.out.println("Enter the Elements");
        for(int i=0; i<size ; i++){
            System.out.print("Element "+i+ " is : ");
             arr1[i] = sc.nextInt();
        }

        System.out.println("Enter index to delete");
        int index = sc.nextInt();


        if(index<0 || index>=size) {
            System.out.println("Index Valid!");
        } else {
            for(int i=index; i<size-1; i++) {
                arr1[i] = arr1[i + 1];
            }
            size--;

            System.out.println("Array after the Deletion");
            for(int i=0 ; i< size; i++){
                System.out.print(arr1[i]+ " ");
            }
            
        }

    }
}
