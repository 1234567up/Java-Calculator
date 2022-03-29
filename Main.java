import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner IntGetter = new Scanner(System.in);
    Scanner StringGetter = new Scanner(System.in);
    Double getNum1;
    Double getNum2;
    int Ask;

    Boolean LoopStarter = true;
    
    while (LoopStarter == true) {

      System.out.println("\n1 = Add, 2 = Subtract, 3 = Multiply, 4 = Divide");
      System.out.print("\nPlease enter the operation you would like to run!:");
      Ask = IntGetter.nextInt();
  
      System.out.print("\nPlease enter the first number you want to use:");
      getNum1 = IntGetter.nextDouble();
  
      System.out.print("\nPlease enter the Second number you want to use:");
      getNum2 = IntGetter.nextDouble();
  
      double Adder = getNum1 + getNum2;
      double Subtractor = getNum1 - getNum2;
      double Multiplyer = getNum1 * getNum2;
      double Divider = getNum1/getNum2;
      
      if (Ask == 1) {
        System.out.println("\nThe Answer is: " + Adder);
      }
  
      if (Ask == 2) {
        System.out.println("\nThe Answer is: " + Subtractor);
      }
  
      if (Ask == 3) {
        System.out.println("\nThe Answer is: " + Multiplyer);
      }
  
      if (Ask == 4) {
        System.out.println("\nThe Answer is: " + Divider);
      }
  
      if (Ask > 4) {
        System.out.println("You can only Add, Subtract, and multiply. You entered a number larger than three for the three operations. Please run the code again and enter a value less than three!");
      }

      }

   
  }
}