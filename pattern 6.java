package i;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        System.out.println("Right angle tringle tringle using numbers");

        System.out.print("Enter the number = ");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        System.out.println("You have entered "+n);
        

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                
            }
            System.out.println();            
        }
        System.out.println(" ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
             
            }
            System.out.println();
        }
         System.out.println(" ");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j);
        }
        System.out.println(); 
    }
    System.out.println(" ");
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n-i+1; j++) {
            System.out.print(j);
        }
        System.out.println(); 
}
}
}
