import java.util.Scanner;

public class Test
{
   public static void main (String [] args)
   {
      Scanner kbd = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int num = kbd.nextInt();
     
      if(hasFive(num))
      {
         System.out.print("You have a number 5 in here");
      }
   
   }
   public static boolean hasFive(int x)
   {
      boolean status;
      String str1 = Integer.toString(x);
      char five = '5';
      if (str1.charAt(0) == five)
      {
         status = true;
         return status;
      }
      else if (str1.charAt(1) == five)
      {
         status = true;
         return status;
      }
      else if (str1.charAt(2) == five)
      {
         status = true;
         return status;
      }
      if (str1.charAt(3) == five)
      {
         status = true;
         return status;
      }
      else
      {
         status = false;
         return status;
      }
   }

}