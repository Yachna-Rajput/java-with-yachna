package d_patterns;

import java.util.Scanner;

public class HollowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Hollow Right Pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();
            }


           // Hollow Reverse Right Pyramid
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i || i == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }


            //  Hollow Right-Aligned Triangle
            for (int i = 1; i <= n; i++) {
                //print spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                //print pattern
                for (int k = 1; k <= i; k++) {
                    if (k == 1 || k == i || i == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }


            // Hollow Central Aligned pyramid
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    if (k == 1 || k == (2 * i - 1) || i == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            // Hollow Reverse central pyramid
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    if (k == 1 || k == (2 * i - 1)|| i == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }


            // Hollow Diamond pattern
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    if (k == 1 || k == (2 * i - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    if (k == 1 || k == (2 * i - 1) ) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            }
        }

