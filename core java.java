import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.swing.undo.StateEdit;
// point-1 its a comment and sidhanta is just a class
public class sidhanta {
  
    /**
     * @param args
     */
    public static void main(String[] args) {
    //  point-2 basic concepts in java
        System.out.println("sidhanta");
        String name = "suman";
        int a = 20;
        float b = 30.33f;
        boolean c = true;
        System.out.println(name);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //point-3 rules to use variable in java
       /*1) java is a case sensitive language
         2) Should not contain space 
         3) reserve keywords are not allowed*/ 
        
        //  data types in java
        /*primitive = byte(1 byte), short(2 byte), int(4 byte), long(8 byte), float(4 byte), double(8 byte), boolean(1 bit), char(2 byte)
        1 byte = 8 bit
          non primitive (reference type) 
         */

        //  operators in java
        /* arithmatic operators
         * assigment operators
         * logical operators
         * comparission operators
         */
        int number_1 = 88;
        int number_2 = 80;
        System.out.println("addition = ");
        System.out.println(number_1 + number_2);
        System.out.println("substraction");
        System.out.println(number_1 - number_2);
        System.out.println("multiplication");
        System.out.println(number_1 * number_2);
        System.out.println("division");
        System.out.println(number_1 / number_2);
        System.out.println("reminder from the division");
        System.out.println(number_1 % number_2);
        System.out.println("incriment operator");
        System.out.println(number_1++);
        System.out.println("decriment operator");
        System.out.println(++number_1);
        System.out.println("results");
        System.out.println(number_1--);
        System.out.println("results are");
        System.out.println(number_1);
        

        //point-4 Use input in java & some use full method of string in java
        System.out.print("Enter your name = ");
        Scanner user_input = new Scanner(System.in);
        String input = user_input.nextLine();//so many other scan methods are there use
        String line_1 = ", nice to meet with you";
        System.out.println("Hi" +input + line_1);//concatenate string 
        System.out.println(input.length());//to find the length of the string
        System.out.println(name.toLowerCase());// convert string in to lower case
        //point-5 escape sequence charecters in java
        System.out.println("welcome\" "+input + line_1); // to use " in the out put
        System.out.println("welcome\\"+input + line_1); // to uses \ in the out put
        System.out.println("welcome\t "+input + line_1); // use \t to make a extra space
        System.out.println("welcome\n "+input + line_1); // use \n to start a new line 
        System.out.println(input.contains("pra")); // it return a boolean value while checking available of entered word in the string
        // also try also search in google for more exciting java string method
        // .endsWith()
        // .charAt()
        // .indexOf()
        // etc
        //point-6 use math methods in java
        //point-7 if-else conditons
        int age = 12;
        if(age > 20){
          System.out.println("you are a man");
        }
        else if(age < 100){
          System.out.println("your are a boy");
        }
        else{
          System.out.println("you are not a boy");

        }
        //point-8 switch statement in java
        // swith case run all the statements so we need to add break
        switch (age){
          case 12:
           System.out.println("you are a 12 year old boy");
           break; // break statement will break the chain if above ans is correct
          case 79:
           System.out.println("you are a 79 year old man");
          default: //default is as equal to else
           System.out.println("you are not a human-being");
        }
        //point-9 while loop in java
        int e = 0;
        while(e < 100){ // use while loop when you know the start and end 
          System.out.println("hi sidhanta");
          e += 1;
        }
        //point-10 do while loop in java
        int sid = 0;
        do {
          System.out.println(sid);
          sid += 1;
        } while (sid>2);
       // point-11 for loop in java
       for (int i = 0; i < 5; i+=2) { // use for loop when you familiar with the number of iteration
        System.out.println("hi ");
       }
       
        // point-12 use of break and continue in java
        // point-13 arrays (collection of values) ,just like list in python
        int[]numbers = {2,4,6,8}; // single dimentional array
        System.out.println(numbers[3]);
        numbers[2] = 32;
        System.out.println(numbers[2]);
        // point-14 for each loop
       for (int fe : numbers) {
        System.out.println(fe);
      }
        // point-15 way to iterate an array
        for (int mid = 0;mid<numbers.length; mid++) {
          System.out.println(mid);
          System.out.println(numbers[mid]);
        }
        //point-16 2d array , ......d array
        int[][] result = {{11,22,3,44},{12,23,34,45}};
        System.out.println(result[0][3]);
        System.out.println(result[1][2]);
        //point-17 try catch
       try {
        System.out.println(result[4][3]);
       } catch (Exception z) {
        System.out.println(z);// TODO: handle exception
       }
       System.out.println("print this line");
        // methods in java
        // public class rough {
        //   static int sum(int one , int two){
        //       return one+two;
        //   }
        //       public static void main(String[] args) {
        //           System.out.println("methods in java");
        //           int ram = 44;
        //           int vim = 68;
        //           int tim = sum(ram,vim);
        //           System.out.println(tim);
        //       }
        //   }
        }

    }
