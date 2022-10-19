package i;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        System.out.println("Right angle tringle or half pyramid");

        System.out.print("Enter the number of row = ");
        Scanner b = new Scanner(System.in);
        int m = b.nextInt();

        System.out.println();
        System.out.println("You have entered number of row = "+m);

for (int i = 1; i <= m; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    } 
    System.out.println();   
}
    }
}
