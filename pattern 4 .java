package i;

import java.util.Scanner;

/**
 * partten4
 */
public class partten4 {

    public static void main(String[] args) {
        System.out.println("Inverse right angle tringle or inverted half pyramid");
        System.out.print("Enter a number of row or column = ");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        System.out.println("You have entered "+n); 

        for (int i = n; i >= 1 ; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();            
        }
    }
}
