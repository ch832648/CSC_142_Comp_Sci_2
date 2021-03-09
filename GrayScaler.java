/** 
Name: Caitlin Harris
Date: 10/16/2018
Title: GrayScaler.java
Description: This program inputs a RBG file(.ppm) and converts
             the file to a grayscale image (.pgm).
Input: RGB image (.ppm)
Output: Grayscale image (.pgm)

**/

import java.util.Scanner;
import java.io.*;

public class GrayScaler
{
   public static void main (String [] args) throws IOException
   {
      String line1;  //String of inputFile's line 1
      int line2_1;  //First int in inputFile's line 2
      int line2_2;   //Second int in inputFile's line 2
      int line3_maxColor;   //First int in inputFile's line 3, the maximum color
     
      String line4;  //Store the comments being input from the rest of the inputFile
      String line5;
      String line6;
      String line7;
      String line8;
      String line9;
  
      
      //Create file object
      File myFile = new File("STOP_sign.ppm");
      
      //Input file
      Scanner inputFile = new Scanner (myFile);
      
      //Input the lines of the file before the pixels
      line1 = inputFile.nextLine();
      line2_1 = inputFile.nextInt();
      line2_2 = inputFile.nextInt();
      line3_maxColor = inputFile.nextInt();
      line4 = inputFile.nextLine();
      line5 = inputFile.nextLine();
      line6 = inputFile.nextLine();
      line7 = inputFile.nextLine();
      line8 = inputFile.nextLine();
      line9 = inputFile.nextLine();
            
      //Output file
      PrintWriter outputFile = new PrintWriter("StopSignGray.pgm");
      
      //Output the lines before the pixels to the .pgm file
      outputFile.println(line1);
      outputFile.println(line2_1 + " " + line2_2);
      outputFile.println(line3_maxColor);
      outputFile.println(line4);
      outputFile.println(line5);
      outputFile.println(line6);
      outputFile.println(line7);
      outputFile.println(line8);
      outputFile.println(line9);
      
      
     //Input the rgb pixels from the .ppm
     //Get the average of the pixels and output it to the .pgm
      for(int i=1;i<=line2_2;i++)
      {
         for(int j=1;j<=line2_1;j++)
         {
            int r = inputFile.nextInt();
            int g = inputFile.nextInt();
            int b = inputFile.nextInt();
            
            int average = (r + g + b)/3;
            outputFile.print(average+ " ");
            outputFile.print(average+ " ");
            outputFile.print(average+ " ");
            
         }
       System.out.println();
      }
      
      System.out.print("Conversion to grayscale complete!");
      
     //Close output and input files
     outputFile.close();
     inputFile.close();
      
   } 
}