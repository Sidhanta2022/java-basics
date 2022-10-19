package i;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        System.out.println("0-1 tringle");

        System.out.print("Enter a number = ");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        System.out.println("You have entered "+n);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i+j;
                if (sum % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();            
        }
    }
}
