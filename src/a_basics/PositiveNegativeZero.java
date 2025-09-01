package a_basics;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("calculate the num is positive,negative or zero");
        System.out.println("Enter the num");
        int num = sc.nextInt();
        if(num>0) {
            System.out.println("your num is postive");
        }
            else if(num==0) {
            System.out.println("your num is zero");
        }
                else{
                    System.out.println(" your num is negative");
                }
            }
        }
