/*
Name: Caitlin Harris
Date: 9/28/2018
Title: IRA.java
Description: This program demonstrates the BankAccount class
           by calculating the user's deposit's and interest
           until their IRA reaches $1 million.
*/
public class IRA
{
   public static void main (String [] args)
   {
   
   int age = 22; //Set age to 22
   
   BankAccount a1 = new BankAccount(); //Create an instance of the BankAccount class
   
   while (a1.getBalance() < 999999) //While the bank account balance is less than $1mill
   {
   age += 1; //Update age
   double interest = a1.computeInterest(); //Calculate and store interest
   a1.deposit(interest); //Deposit interest
   a1.deposit(2000); //Deposit annual contribution
   }
   System.out.printf("You are %2d and your balance is $%7.2f", age, a1.getBalance());
   }
}