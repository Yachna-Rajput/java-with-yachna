package c_loops;


import java.util.Scanner;

public class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String str = sc.nextLine();
        System.out.println("Your String is : " + (isPalindrome(str) ? " Palindrome" : " Not Palindrome"));


    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        int lastposition = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastposition)) {
            return false;

        }
        String newStr = str.substring(1, lastposition);
        return isPalindrome(newStr);

    }
}
