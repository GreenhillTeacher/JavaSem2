

import java.util.*;
public class Chapter4_3 {
   /*
   Write a method called season that takes as parameters two integers representing a month and day and returns a
String indicating the season for that month and day. Assume that the month is specified as an integer between 1
and 12 (1 for January, 2 for February, and so on) and that the day of the month is a number between 1 and 31. If the
date falls between 12/16 and 3/15, the method should return "winter". If the date falls between 3/16 and 6/15, the
method should return "spring". If the date falls between 6/16 and 9/15, the method should return "summer". And
if the date falls between 9/16 and 12/15, the method should return "fall".
   */

   public static void main (String [] args){
       Scanner input= new Scanner(System.in);
       int month, day;
       String season;
       do{
       System.out.print(" What is the month 1-12 ");
       month = input.nextInt();
       System.out.print(" What is the da 1-31 remember February has only 28 ");
       day= input.nextInt();
       season = checkMethod(month,day);
       System.out.println("The season for "+month +"/"+day+" is "+season );
       System.out.print("Would you like to chech another date ");
       season=input.next();
       }
       while(season.contains("y" ) || season.contains( "Y"));
       System.out.println("Good trip");
   }
   public static String checkMethod(int m, int d){
       if((m==12 && d >15 && d<=31)||m==1||m==2||(m==3 && d<=15) ){
           return "Winter";
       }
       else{
       return "I have no clue";
       }
   }

}
