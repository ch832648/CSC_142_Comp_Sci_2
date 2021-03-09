public class DateMaker{
   public int year;
   public int month;
   public int day;

   public DateMaker(int m, int y){
      month=m;
      year=y;
   }
   
   public String getMonthName(){
      switch (month){
         case 1: return "January";
          
         /*case 2: System.out.print("February");
            break;
         case 3: System.out.print("March");
            break;
         case 4: System.out.print("April");
            break;
         case 5: System.out.print("May");
            break;
         case 6: System.out.print("June");
            break;      
         case 7: System.out.print("July");
            break;
         case 8: System.out.print("August");
            break;
         case 9: System.out.print("September");
            break;
         case 10: System.out.print("October");
            break;
         case 11: System.out.print("November");
            break;
         case 12: System.out.print("December");
            break;
         default: System.out.print("Invalid Month");*/
      }
      return "invalid month";
   }
   
   public int numDay(){
      if((month == 4)||(month == 6)||(month == 9)||(month == 11)){
         return 30;
      }
      else if(isLeapYear()){
         return 29; 
      }
      else if(month == 2){
         return 28;
      }
      else {
         return 31;
      }
   }
   
   public boolean isLeapYear(){
      if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
         return true;
      else 
         return false;
   }
}
/*
31 DAY MONTHS:          30 DAY MONTHS:          FEBRUARY:
   January (1)          April (4)               28 days in a common year
   March (3)            June (6)                29 days in a leap year
   May (5)              September (9)
   July(7)              November (11)
   August (8)
   October (10)
   December (12)


*/