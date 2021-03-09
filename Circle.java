/*
Name: Caitlin Harris
Date: 9/26/2018
Title: Circle.java
Description: Circle class
*/

public class Circle
{
   //Fields
   private double radius;
   private final double PI = 3.14159;

   //Constructor that accepts one para
   //@param rad The radius of the circle
   public Circle(double rad)
   {
      radius = rad;
   }
   
   //No arg Constructor that sets the radius to 0.0
   public Circle()
   {
   radius = 0.0;
   }
   
   public void setRadius(double rad)
   {
   radius = rad;
   }
   
   public double getRadius()
   {
   return radius;
   }
   
   public double getArea()
   {
   return PI * (radius * radius);
   }
   
   public double getDiameter()
   {
   return 2 * radius;
   }
   
   public double getCircumference()
   {
   return 2 * PI * radius;
   }
}