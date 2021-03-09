/*
NAME: Caitlin Harris
DATE: 9/13/2018
TITLE: Diagonals.java
DESCRIPTION: This program asks a user for an integer and displays a diagonal line of X's 
            of the specified size.
INPUT: An integer.
OUTPUT: Diagonal line of X's of specified integer.
*/

import java.util.Scanner;

public class Diagonals
{
   public static void main (String [] args)
   {
      Scanner kbd = new Scanner (System.in); 
   
      int num;       //user input number
      char X = 'X';  //character
      String blank = " ";  //blank
   
      System.out.print("Enter an integer: ");
      num = kbd.nextInt();
   
      for (int i = 0; i <= num-1; i++) //for loop that prints char 'X'
      {
         for (int j = 1; j <= i; j++) //for loop that prints blank spaces
         {
            System.out.print(blank);
         }
         System.out.println(X);
      }
   }
}