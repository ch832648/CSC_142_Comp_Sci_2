/*
NAME: Caitlin Harris
DATE: 9/13/2018
TITLE: ThreeLetterAcronym.java
DESCRIPTION: This program allows a user to enter three words and displays
            the appropriate three-letter acronym in all uppercase letters.
INPUT: Three words
OUTPUT: Three-letter acronym for three words entered
*/
import java.util.Scanner;

public class ThreeLetterAcronym
{
   public static void main (String [] args)
   {
      Scanner kbd = new Scanner(System.in);
      
      int spacePos; //position of spaces between words in the string
      String str1;
      char char1,
            char2,
            char3;
      
      
      System.out.print("Enter three words: ");
      str1 = kbd.nextLine();
      
      str1 = str1.toUpperCase(); //change string to upper case
      
      
      spacePos = str1.indexOf(" ");  //search for first blank in string
      char1 = str1.charAt(0); //store first char of first word
      
      spacePos+=1;
      char2 = str1.charAt(spacePos); //store first char of second word
      str1 = str1.substring(spacePos); 
      
      spacePos = str1.indexOf(" "); //search for second blank in remainder of string
      spacePos+=1;
      char3 = str1.charAt(spacePos); //store first char of third word
     
      
      System.out.print("The acronym is: " + char1 + char2 + char3);
      
      
      
   }
}