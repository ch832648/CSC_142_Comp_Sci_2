/*
	   Name: Caitlin Harris
	   Date: 10/18/2018
	   Title: Histogram.java
	   Description: A program to practice with the use of arrays
	                The program will read in a series of grades (note
	                that all of the grades should be integers between
	                0 and 10 (terminated by a -1). The computer will
	                produce a histogram of those grades.
	   Input:a series of grades between 0 and 10, terminated by a -1
	   Output:the histogram of those grades

	 */

import java.util.Scanner;
public class Histogram {

   public static void main (String[] args) {
   
      final int GRADERANGE = 11; // allow for scores from 0 - 10
   
      int[] gradeList = new int[GRADERANGE];
      int grade;
   
      Scanner in = new Scanner(System.in);
   
               // Now read in the input
      System.out.println("Enter a grade (-1 to terminate)");
      grade = in.nextInt();
   
      while (grade != -1) {
                   /* modify the gradeList array to account for the grade
                       how do you do this? */
                       
                  //check that the input is valid     
         if (grade >= GRADERANGE || grade < 0)
         {
            System.out.println("Please reenter a valid grade");
         }
                //add 1 to the position of the grade entered       
         else gradeList[grade]++;
      
                   // now read in another grade
         System.out.println("Enter a grade (-1 to terminate)");
         grade = in.nextInt();
               
      }
   
               // now print out the histogram
      printHistogram (gradeList);
      
              //print out the grade average and most frequent grade
      System.out.printf("The average of the grades is: %.2f\n", findAverage(gradeList));
      System.out.printf("The most frequent grade is: %d", mostFreqGrade(gradeList));
   
   } // ends the main
   
   /****************************************************************
		method mostFreqGrade
		This function searches the array passed in for the most
      frequent grade
		Input: an array of ints
		Output: the most frequent grade
	     ***************************************************************/
   public static int mostFreqGrade(int[]g)
   {
   int freqGrade = -1;
   
      for(int i=1;i<g.length;i++)
      {
      if(g[i]>freqGrade)
      freqGrade=i;
  
      else
      freqGrade+=0;
      }
      return freqGrade;
   }
   
   
   /****************************************************************
		method findAverage
		This function calculates the average of the grades
      passed in from the array
      Input: an array of ints
		Output: average grade
	     ***************************************************************/      
   public static double findAverage(int[]g)
   {
   
      double average;
      int sum = 0;
      int total = 0;
   
      for(int i = 0; i < g.length; i++)
      {
         if(g[i]==0)
            total+=0;
         else
         {
            sum+=g[i]*i;
            total+=g[i];
         }
      }
      average = sum/(double)total;
      
      return average;
   }


	    /****************************************************************
		method printHistogram
		This function draws a histogram of the values passed in by
		  an array
		Input: an array of ints
		Output: None, but the histogram is drawn
	     ***************************************************************/
   public static void printHistogram (int[] list) {
   
      int index;
      for (index = 0; index <list.length; index ++) {
         System.out.print(index + " |");
         drawRow( list[index] );
      }
   }

	    /*****************************************************************
		method drawRow
		This function draws a row of stars, whose length is specified
		   by the caller
		Input: the length of the row of stars to be drawn (an int)
		Output: None, but a row of stars is drawn
	     ****************************************************************/
   public static void drawRow (int numstars) {
      int count;
      for (count = 1; count <= numstars; count ++) {
         System.out.print("*");
      }
   
      System.out.println();
   }

}  // ends the class