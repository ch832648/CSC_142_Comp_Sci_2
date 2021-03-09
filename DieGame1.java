/*
Name: Caity Harris
Date: 9/28/2018
Title: DieGame1.java
Description: This program uses the Die class to play a simple
            dice game between the computer and the user.
*/

public class DieGame1
{
   public static void main (String [] args)
   {
      int userWin = 0; //Number of times the user wins
      int computerWin = 0; //Number of times the computer wins
      final int dieSides = 6; //Number of sides on the die
      
      Die user = new Die (dieSides); //Create first instance of the Die class
      Die computer = new Die (dieSides); //Create second instance of the Die class
   
      for (int i=0; i<=10; i++)
      {
         user.roll(); //Roll user's die
         computer.roll(); //Roll computer's die
      
         if(user.getValue()>computer.getValue()) //If user's value is greater, they recieve a win
            userWin+=1;
         
         else if(user.getValue()<computer.getValue()) //Else if computer's value is greater, they recieve a win
            computerWin+=1;
      }
      if (userWin>computerWin) //If the user won the game
      System.out.print("Congratulations, the user won this game!");
      
      else if (userWin<computerWin) //If the computer won the game
      System.out.print("Sorry, the computer won this game");
      
      else //If it was a tie
      System.out.print("It was a tie!");
   }
}