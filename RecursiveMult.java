/*
Name:                Caitlin Harris
Date:                12/10/2018
Title:               RecursiveMult.java
Description:         A program to do multiplication by doing 
                     repeated additions. It illustrates the use of recursion. 
                     Basically, the mathematics implemented is:
                     Mult (n, 0) = 0
                     Mult (n, m) = n + Mult (n, m-1)
Input:               the two integers to be multiplied
Output:              the result of the multiplication

*/

import java.util.Scanner;

public class RecursiveMult {

   public static void main(String[] args) {
   
      int number1, number2, result;
              
      Scanner in = new Scanner(System.in);
   
      System.out.print("Enter an integer");
      number1 = in.nextInt();
      System.out.print("Enter a second integer");
      number2 = in.nextInt();
              
      result = mult(number1, number2);
      System.out.println("The value of " + number1 + " * " +
                        number2 + " is " + result);
              
   }
           
   public static int mult(int n1, int n2) {
      int returnval; 
   
      //base case
      if (n2 == 0 || n1 ==0) {
         returnval = 0;
      } 
      
      //recursive step
      else {
         if(n1<0 && n2<0)
         returnval = n2 + mult (n1+1, n2);
      
         else if(n2<0) {
         
         returnval = n2 + mult (n1-1, n2);
         }
         
         else
            returnval = n1 + mult (n1, n2 - 1);
      }
      
      return returnval;
   } // ends the Mult function
           
} // ends the class