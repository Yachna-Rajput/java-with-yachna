package b_arrays;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Check wheather the array is Palindrome or not ");
        int[] arr = ArrayUtility.inputArray();
        boolean palin = isPalindrome(arr);
        if(palin){
            System.out.println("Your Array is palindrome");
        }else{
            System.out.println("Your Array is not Palindrome");
        }

    }
    public static boolean isPalindrome(int[] arr){
        int i = 0;
        while(i< arr.length / 2){
            if(arr[i] != arr[(arr.length - 1 ) -i]){
                    return false;

            }
            i++;
        }
        return true;

    }
}
