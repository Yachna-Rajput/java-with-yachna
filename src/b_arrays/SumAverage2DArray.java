package b_arrays;

public class SumAverage2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum and Average of 2D Array ");
        int[][] arr = ArrayUtility.input2DArray();
        long Sum= sum(arr);
        double avg = average(arr);
        System.out.println("Your sum of array is : " +Sum);
        System.out.println("Your average of array is : " +avg);



    }
    public static double average(int[][] arr){
        if(arr.length == 0){
            return 0;
        }
        int rows = arr.length;
        int columns = arr[0].length;
        double size = rows*columns;
        return sum(arr)/size;
    }

    public static long sum(int[][] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    }

