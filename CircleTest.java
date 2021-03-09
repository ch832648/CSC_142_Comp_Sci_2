/*
Name: Caitlin Harris
Date: 9/26/2018
Title: CircleTest.java
Description: This program demonstrates the Circle class
           by asking the user for the circle's radius
           and reporting it's area, diameter, and 
           circumference.
*/

import java.util.Scanner;

public class CircleTest
{
   public static void main (String [] args)
   {
      //Create Scanner object
      Scanner kbd = new Scanner(System.in);
      
      double testRadius; //To hold the radius
      
      //Get the radius
      System.out.print("Enter the circle's radius: ");
      testRadius = kbd.nextDouble();
      
      //Create an instance of the circle class
      Circle c1 = new Circle(testRadius);
      
      //Get the data from the circle and display it
      System.out.println("Here is your circle's information: ");
      System.out.println("Radius: " + c1.getRadius());
      System.out.println("Area: " + c1.getArea());
      System.out.println("Diameter: " + c1.getDiameter());
      System.out.println("Circumference: " + c1.getCircumference());
     
   }
}

