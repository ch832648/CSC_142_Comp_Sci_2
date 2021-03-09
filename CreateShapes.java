/*
Name: Caitlin Harris
Date: 12/6/2018
Title: CreateShapes.java
Description: Program that creates a bunch of rectangles.
*/
import java.util.ArrayList;

public class CreateShapes {
   public static void main(String[] args) {
   
      // create some rectangles
      Rect r1 = new Rect (2,3,2,1);
      Rect r2 = new Rect (8,8,3,5);
      Rect r3 = new Rect (-1,2,2,1);
      Rect r4 = new Rect (r3);   // uncomment this line after modifying Rect.java
      System.out.println("r3: " + r3.toString() + "\nr4: " + r4.toString()+"\n");
      
      //create ArrayList to hold rectangle objects
      ArrayList <Rect> tangles = new ArrayList<Rect>();
      tangles.add(r1);
      tangles.add(r2);
      tangles.add(r3);
      tangles.add(r4); 
   
      System.out.printf("Created %d shapes\n", Rect.getNumShapes());
   
      // shift some of the rectangles around
      r1.shift(5,0);
      r3.shift(2,2);
   
      // print out final locations of rectangles
      System.out.println(r1);
      System.out.println(r2);
      System.out.println(r3);
      System.out.println(r4);    
      
      //call method to test if any rectangles are squares
      System.out.println("Are any rectangles squares?: " + areAnySquare(tangles));
   }
   
   public static boolean areAnySquare(ArrayList<Rect> r){
      boolean returnVal = false;
      for(int i=0;i<r.size();i++){
         if(r.get(i).isSquare())
            returnVal=true;
      }
      return returnVal;
   }
}