package a_basics;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of Triangle");
        float base =sc.nextFloat();
        System.out.println("Enter the Height of Triangle");
        float height = sc.nextFloat();
        float Area = (base*height)/2;
        System.out.println("The area of Triangle is : " +Area);
        }
    }
