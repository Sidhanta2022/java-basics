import java.util.Scanner;

/**
 * rough
 */
public class rough {

    public static void main(String[] args) {
        System.out.println("choose a number in between 1 to 7");
        int b;
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter your number = ");
        b = user_input.nextInt();
        switch (b){
            case 1:
                System.out.println("sunday is a hollyday");
            case 2:
            System.out.println("monday is the first working day of the week");
                
                break;
            case 3:
            System.out.println("tuesday is the second working day of the week");
                
                break;
            case 4:
            System.out.println("wednesday is the third day of working");
                
                break;
            case 5:
            System.out.println("thursday the the day of goddess laxmi and siridi  \"sai baba\" ");
                
                break;
            case 6:
            System.out.println("fry day is day for non-veg");
                
                break;
            case 7:
            System.out.println("saterday is a day of weekend");
                
                break;
            default:
            System.out.println("plese enter a number in between 1 to 7");
                break;
        }          
    }
}
/**
 * rough
 */
// public class rough {

//     public static void main(String[] args) {
//         System.out.println("google");
//         System.out.print("Enter your name : ");
//         Scanner user_input = new Scanner(System.in);
//         String data = user_input.nextLine();
//         System.out.println("Hi " + data + ", Nice to meet with you");
//     }
// }
