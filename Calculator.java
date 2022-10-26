public class rough {
    public static void cal( int a, int b, int c){
      if (c == 1) {
        System.out.print("sum of " +a+ " & " +b +" = ");
         System.out.println(a+b);}
      else if (c==2){
        System.out.print("sub of " +a+ " & " +b +" = ");
         System.out.println(a-b);
      }
      else if(c==3){
        System.out.print("mul of " +a+ " & " +b +" = ");
        System.out.println(a*b);
      }
      else if (c==4){
        System.out.print("div of " +a+ " & " +b +" = ");
        System.out.println(a/b);
      }
      else {
        System.out.println("error please enter a valid number");
        
      }
      return;
    }
    public static void main(String[] args) {
        System.out.println("Calculator using function in java");
       

        System.out.print("Enter a number = ");
        Scanner a = new Scanner(System.in);
        int num_1 = a.nextInt();
        System.out.println("You have entered "+num_1);

        System.out.print("Enter another number = ");
        Scanner b = new Scanner(System.in);
        int num_2 = b.nextInt();
        System.out.println("You have entered "+num_2);

        System.out.print("Enter a operator = ");
        Scanner c = new Scanner(System.in);
        int num_3 = c.nextInt();
        System.out.println("You have entered "+num_3);

        cal(num_1,num_2,num_3);

    }
}
