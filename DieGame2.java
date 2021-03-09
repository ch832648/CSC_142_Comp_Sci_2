/*
Name: Caity Harris
Date: 9/28/2018
Title: DieGame2.java
Description: This program uses the Die class to play a single-
            player die game.
*/
import java.util.Scanner; 

public class DieGame2
{
   public static void main (String [] args)
   {
      int totalPoints = 10; //Set totalPoints equal to 10
      final int dieSides = 6; //Set the number of sides on the die
      
      Die user = new Die(dieSides); //Create instance of the Die class
      Scanner kbd = new Scanner(System.in); //Create instance of Scanner class
      
      while (totalPoints>0)
      {
         System.out.println("Enter your wager between 1-3 points: ");
         int wager = kbd.nextInt();
         
         if(totalPoints>=wager)
         {
         
            System.out.println("Enter your guess between 1-6: "); //Ask User for their guess
            int guess = kbd.nextInt(); //store guess in variable
            
            user.roll(); //roll die
            
            if (guess == user.getValue()) //if guess==die value
            {
               if (wager == 1)//if wager==1, add 2 point
                  totalPoints+=2;
               else if (wager == 2)//else if wager==2, add 6 points
                  totalPoints +=6;
               else if (wager == 3)//else if wager==3, add 12 points
                  totalPoints +=12;
            }
            else if (guess != user.getValue()) //else if(guess!=die value)
               totalPoints -= wager; //totalPoints -= wager;
         
            System.out.println("Your total points so far are " + totalPoints);
         }
      }
      System.out.println("Sorry, you lost the game");
   }
}