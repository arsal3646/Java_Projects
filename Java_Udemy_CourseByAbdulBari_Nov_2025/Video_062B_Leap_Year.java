// Student Challenge: Find a given year is a leap year

import java.lang.*;
import java.util.*;  // To use Scanner class

class Video_062B_Leap_Year
{
    public static void main(String args[])
    {
       // Take a year (yyyy) and check whether it is a leap year or not

       System.out.println("Please enter a year in yyyy format, e.g. 2015 or 1983");
       Scanner sc = new Scanner(System.in);
       int year = sc.nextInt();

       if ((year % 4) == 0)
       {
        if((year % 100) == 0)
        {
           if((year % 400) == 0)
           {
              System.out.println("It is a leap year.");
           }
           else
           {
              System.out.println("It is not a leap year because of 100-years rule."); 
           }
        }
       }
       else
       {
        System.out.println("It is not a leap year because of 4-years rule.");
       } 
    }
}
