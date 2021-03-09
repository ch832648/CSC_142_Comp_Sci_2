/** 
Name: Caitlin Harris
Date: 9/30/18
Title: Inverter.java
Description: This program inputs the file "J.pbm", inverts
            it's pixels and outputs them to "J-inverted.pbm"1

**/

import java.util.Scanner;
import java.io.*;

public class Inverter
{
   public static void main (String [] args) throws IOException
   {
      String line1;  //String of inputFile's line 1
      String line2;  //String of inputFile's line 2
      int line3_1;   //First int in inputFile's line 3
      int line3_2;   //Second int in inputFile's line 3
      int num;       //Stores the ints being input from the rest of the inputFile
      
      //Create file object
      File myFile = new File("J.pbm");
      
      //Input file
      Scanner inputFile = new Scanner (myFile);
      
      //Input the first three lines of the file
      line1 = inputFile.nextLine();
      line2 = inputFile.nextLine();
      line3_1 = inputFile.nextInt();
      line3_2 = inputFile.nextInt();
      
      //Create PrintWriter object
      PrintWriter outputFile = new PrintWriter ("J-inverted.pbm");
      
      //Output the first three lines of the input to the outputFile
      outputFile.println(line1);
      outputFile.println(line2);
      outputFile.println(line3_1 + " " + line3_2);
      
      System.out.println(line2);
      
      for(int i=1; i<=line3_2; i++)
      {
         for(int j=1; j<=line3_1; j++)
         {
            num = inputFile.nextInt(); //Input each int from the inputFile
         
            if(num==0) //If num is equal to 0, change and output it as 1 to the outputFile
            {
               num = 1;
               outputFile.print(num);
            }
            else if(num==1) //If num is equal to 1, change and output as a 0 to the outputFile
            {
               num = 0;
               outputFile.print(num);
            }
         
         }
         System.out.println(); //Next line
      }
      outputFile.close(); //Close outputFile
      
      inputFile.close(); //Close inputFile
      
   }
}