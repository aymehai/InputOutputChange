 import java.util.Scanner;

public class InputOutputChange 
{ 
  public static void main( String[] args ) 
  { 
    Scanner keyboard = new Scanner(System.in);

    int num1, num2;
    double average = 0;

    System.out.print( "First temperature? " );
    num1 = keyboard.nextInt();

    System.out.print( "Second temperature? " );
    num2 = keyboard.nextInt();
    
    average = (double) num1/num2;

    System.out.println("The average value is " + average);
  }
}