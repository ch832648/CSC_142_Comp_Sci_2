/*
NAME: Caitlin Harris
DATE: 9/11/2018
TITLE: Ordering.java
DESCRIPTION: This program asks a user to enter three integers. 
            The integers are then displayed in asending and descending order.
INPUT: Three integers
OUTPUT: Ascending and descending order of the integers.
*/
import java.util.Scanner;

public class Ordering
{
   public static void main (String [] args)
   {
   Scanner kbd = new Scanner(System.in);
   int num1,
      num2,
      num3;
      
   System.out.println("Enter three integers: ");
   num1 = kbd.nextInt();
   num2 = kbd.nextInt();
   num3 = kbd.nextInt();
   
   if (num1 > num2 && num2 > num3)
   {
   System.out.println("The numbers in acending order are: " + num3 + " " + num2 +
                       " " + num1);
   System.out.println("The numbers in descending order are: "+ num1 + " " + num2 +
                        " " + num3);
   }
   else if (num2 > num1 && num1 > num3)
   {
   System.out.println("The numbers in acending order are: " + num3 + " " + num1 +
                       " " + num2);
   System.out.println("The numbers in descending order are: "+ num2 + " " + num1 +
                        " " + num3);
   }
   else if (num3 > num2 && num2 > num1)
   {
   System.out.println("The numbers in acending order are: " + num1 + " " + num2 +
                       " " + num3);
   System.out.println("The numbers in descending order are: "+ num3 + " " + num2 +
                        " " + num1);
   }
   else
   {
   System.out.println("The numbers in acending order are: " + num2 + " " + num3 +
                       " " + num1);
   System.out.println("The numbers in descending order are: "+ num1 + " " + num3 +
                        " " + num2);
   }
   }
}