package b_arrays;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("We Reverse the Array here ");
         int[] arr = ArrayUtility.inputArray();
         reverse(arr);
        System.out.println("Your reversed array is ");
        ArrayUtility.displayArray(arr);


    }
    public static void reverse(int[] arr){
        int i = 0;
        while(i < arr.length / 2){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;

        }
    }
}
