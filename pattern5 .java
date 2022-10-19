package i;

import java.util.Scanner;

/**
 * pattern5
 */
public class pattern5 {

    public static void main(String[] args) {
        System.out.println("Reverse right angle tringle or half pyramid rotated by by 180 horizontaly");
        
        System.out.print("Enter a number of row or column = ");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        System.out.println("You have entered "+n);

        for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
           }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
