package c_loops;

import java.util.Scanner;

public class PrintEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<=100 ; i++){
            if(i % 2 ==1){
                continue;
            }
            System.out.println(i);
        }

    }
}
