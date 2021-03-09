/*
Name:                Caitlin Harris
Date:                12/10/2018
Title:               RecursiveExp.java
Description:         A program to do solve exponentiation by repeated
                     multiplication.
Input:               two integers: 1st integer, raised to the power of the 2nd integer
Output:              the result of exponentiation

*/
import java.util.Scanner;

public class RecursiveExp {

   public static void main(String[] args) {
   
      int number1, number2, result;
              
      Scanner in = new Scanner(System.in);
   
      System.out.print("Enter an integer: ");
      number1 = in.nextInt();
      System.out.print("Enter a second integer: ");
      number2 = in.nextInt();
              
      result = mult(number1, number2);
      System.out.println("The value of " + number1 + " to the power of " +
                        number2 + " is " + result);
              
   }
           
   public static int mult(int n1, int n2) {
      int returnval; 
   //base case
      if (n2 == 0) {
         returnval = 1;
      } 
      
   //recursive step
      else {
         returnval = n1 * mult (n1, n2 - 1);
      }
      
      return returnval;
   } // ends the Mult function
           
} // ends the class