import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        System.out.println("floyd's tringle");

        System.out.print("Enter a number = ");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        System.out.println("You have entered "+n);

        int x = 1;
        for (int i = 1; i <=n; i++) {
            for (int j = 16; j <= i ;j++) {
                System.out.print(x);
                x += 1;
            }
            System.out.println();
        }
    }
}
