/*
NAME: Caitlin Harris
DATE: 9/13/2018
TITLE: OddFives.java
DESCRIPTION: This program allows the user to input integers and produces the
            sum of only those numbers that are odd AND contain a five.
INPUT: Integers
OUTPUT: Sum of the odd integers that contain 5 (also known as the magic sum)
*/
import java.util.Scanner;

public class OddFives
{
   public static void main (String [] args)
   {
      int num;
      int sum = 0;
      final int SENTINEL = -1;
      Scanner kbd = new Scanner(System.in);
   
      System.out.print("Enter a positive integer or -1 to exit: "); 
      num = kbd.nextInt();    //intial input value
   
      while(num != SENTINEL)     //test if input = sentinel
      {
         if (hasFive(num) && isOdd(num))  //test if the input contains a five AND is odd
         {
            sum +=num;     //add input to the sum
            System.out.print("Enter a postive integer or -1 to exit: ");
            num = kbd.nextInt();  //retrieve next input
         }  
         else  //if the input doesn't contain a five AND is odd
         {
            System.out.print("Enter a positive integer or -1 to exit: ");
            num = kbd.nextInt(); //retrieve next input
         }
      }
      System.out.print("The magic sum is: " + sum); //output the sum of integers that contained a five AND odd
   }
      
   public static boolean isOdd(int x)
   {
      if(x%2==0)
      {
         return false;
      }
      else
      {
         return true;
      }
   
   
   }
   public static boolean hasFive(int x)
   {
      String str1 = Integer.toString(x); //change integer to string
      str1 = str1 + "     "; //add positions to string so the char's can be tested
      char five = '5';
      if (str1.charAt(0) == five)
      {
        return true;
      }
      else if (str1.charAt(1) == five)
      {
         return true;
      }
      else if (str1.charAt(2) == five)
      {
         return true;
      }
      else if (str1.charAt(3) == five)
      {
         return true;
      }
      else if (str1.charAt(4) == five)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}