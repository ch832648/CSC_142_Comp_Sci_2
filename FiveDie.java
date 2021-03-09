/*
Name: Caitlin Harris
Date: 9/28/2018
Title: FiveDie.java
Description: This program uses the Die class to play game with five
             die. The program will classify the highest combination
             of dice values given the following order.
             1. Five of a kind
             2. Four of a kind
             3. Three of a kind
             4. Pair
*/
public class FiveDie
{
   public static void main (String [] args)
   {
   //Create five instances of the Die class (five dice)
      Die die1 = new Die(6);
      Die die2 = new Die(6);
      Die die3 = new Die(6);
      Die die4 = new Die(6);
      Die die5 = new Die(6);
      
  //Store the value of each roll
      int d1 = die1.getValue();
      int d2 = die2.getValue();
      int d3 = die3.getValue();
      int d4 = die4.getValue();
      int d5 = die5.getValue();
      
  //Create count variables to save the values of the die 
      int count_1=0;
      int count_2=0; 
      int count_3=0; 
      int count_4=0;
      int count_5=0; 
      int count_6=0;
      
  //Test die 1's value and store in count variable
      if (d1==1)
         count_1+=1;
      else if (d1==2)
         count_2+=1;
      else if (d1==3)
         count_3+=1;
      else if (d1==4)
         count_4+=1;
      else if (d1==5)
         count_5+=1;
      else if (d1==6)
         count_6+=1;
   
   //Test die 2's value and store in count variable
      if (d2==1)
         count_1+=1;
      else if (d2==2)
         count_2+=1;
      else if (d2==3)
         count_3+=1;
      else if (d2==4)
         count_4+=1;
      else if (d2==5)
         count_5+=1;
      else if (d2==6)
         count_6+=1;
         
   //Test die 3's value and store in count variable 
      if (d3==1)
         count_1+=1;
      else if (d3==2)
         count_2+=1;
      else if (d3==3)
         count_3+=1;
      else if (d3==4)
         count_4+=1;
      else if (d3==5)
         count_5+=1;
      else if (d3==6)
         count_6+=1;
         
    //Test die 4's value and store in count variable
      if (d4==1)
         count_1+=1;
      else if (d4==2)
         count_2+=1;
      else if (d4==3)
         count_3+=1;
      else if (d4==4)
         count_4+=1;
      else if (d4==5)
         count_5+=1;
      else if (d4==6)
         count_6+=1;
         
   //Test die 5's value and store in count variable
      if (d5==1)
         count_1+=1;
      else if (d5==2)
         count_2+=1;
      else if (d5==3)
         count_3+=1;
      else if (d5==4)
         count_4+=1;
      else if (d5==5)
         count_5+=1;
      else if (d5==6)
      
      //Print the values of each die
      System.out.printf("Player roll: %d %d %d %d %d", die1.getValue(), die2.getValue(),
                     die3.getValue(), die4.getValue(), die5.getValue());
      
      //Test for five of a kind               
      if (fiveOfAKind(count_1,count_2,count_3,count_4,count_5,count_6) != -1)
         System.out.println("Player has a five of a kind of, " + fiveOfAKind(count_1,count_2,count_3,count_4,count_5,count_6) +
                        "s");
      //Test for four of a kind
      else if (fourOfAKind(count_1,count_2,count_3,count_4,count_5,count_6) != -1)
         System.out.println("Player has a four of a kind of, " + fourOfAKind(count_1,count_2,count_3,count_4,count_5,count_6) +
                        "s");
      //Test for three of a kind
      else if (threeOfAKind(count_1,count_2,count_3,count_4,count_5,count_6) != -1)
         System.out.println("Player has a three of a kind of, " + threeOfAKind(count_1,count_2,count_3,count_4,count_5,count_6) +
                        "s");
      //Test for a pair
      else if (twoOfAKind(count_1,count_2,count_3,count_4,count_5,count_6) != -1)
         System.out.println("Player has a pair of " + twoOfAKind(count_1,count_2,count_3,count_4,count_5,count_6) +
                        "s");
                        
      else 
         System.out.println("Sorry, no similar integers");
   }


   public static int fiveOfAKind(int c1, int c2, int c3, int c4, int c5, int c6)
   {
   //Test the count variables for a five (five of a kind)
      if (c1 == 5)
         return 1;
      else if (c2 == 5)
         return 2;
      else if (c3 == 5)
         return 3;
      else if (c4 == 5)
         return 4;
      else if (c5 == 5)
         return 5; 
      else if (c6 == 5)
         return 6;
      else
         return -1;
   }

   public static int fourOfAKind(int c1, int c2, int c3, int c4, int c5, int c6)
   {
   //Test the count variables for a four (four of a kind)
      if (c1 == 4)
         return 1;
      else if (c2 == 4)
         return 2;
      else if (c3 == 4)
         return 3;
      else if (c4 == 4)
         return 4;
      else if (c5 == 4)
         return 5; 
      else if (c6 == 4)
         return 6;
      else
         return -1;
   }

   public static int threeOfAKind(int c1, int c2, int c3, int c4, int c5, int c6)
   {
   //Test the count variables for a three (three of a kind)
      if (c6 == 3)
         return 6;
      else if (c5 == 3)
         return 5;
      else if (c4 == 3)
         return 4;
      else if (c3 == 3)
         return 3;
      else if (c2 == 3)
         return 2; 
      else if (c1 == 3)
         return 1;
      else
         return -1;
   }

   public static int twoOfAKind(int c1, int c2, int c3, int c4, int c5, int c6)
   {
   //Test the count variables for a two (a pair)
      if (c6 == 2)
         return 6;
      else if (c5 == 2)
         return 5;
      else if (c4 == 2)
         return 4;
      else if (c3 == 2)
         return 3;
      else if (c2 == 2)
         return 2; 
      else if (c1 == 2)
         return 1;
      else
         return -1;
   }
}