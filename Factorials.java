/*
NAME: Caitlin Harris
DATE: 9/11/2018
TITLE: Factorials.java
DESCRIPTION: This program calculates the factorial for 
            every integer value from 1 to 10.
INPUT: Integers 1 - 10.
OUTPUT: Factorials for integers 1 - 10.
*/

public class Factorials
{
   public static void main (String [] args)
   {
      int factorial = 1;
      int number = 10;
   
      for (int i=1;i<=number;i++)
      {
         factorial = factorial * i;
         System.out.println(i + "! = " + factorial);
      }
   }
}