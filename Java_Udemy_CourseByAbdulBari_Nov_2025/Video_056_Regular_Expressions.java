// Find if a Number is Binary or not.
// FInd if a Number is Hexa-decimal or not.
// Find if the data in Date format (dd/mm/yyyy) or not. 

import java.lang.*;
import java.util.*;

class Video_056_Regular_Expressions
{
    public static void main(String args[])
    {
        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        
        // Take in a form of string and then check if binary, hexa and date format or not.
        
        int a = sc.nextInt();
        // String str = a+""; coverts to string

        int b = 1000110;

        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        
        System.out.println("Checks for Binary NUmbers: ");
        System.out.println(str1.matches("[01]*"));   // it means as many times 0 or 1 can appear. It can be ZERO times also.
        System.out.println(str1.matches("[01]+"));  // it will ensure that at least one time 01 is there.

        System.out.println(str2.matches("[01]*"));   // it means as many times 0 or 1 can appear. It can be ZERO times also.
        System.out.println(str2.matches("[01]+"));  // it will ensure that at least one time 01 is there.

        // Checking Hexadecimal or not, i.e. 0 to 9 and A to F
        System.out.println("Checks for Hexadecimal NUmbers: ");
        System.out.println("Please enter a number: ");
                     
        String h = sc.next();
        
        int j = 0x234AB;

        String str3 = String.valueOf(h);
        String str4 = String.valueOf(j);
        
        System.out.println(str3.matches("[0-9A-F]*"));   // it means as many times 0 or 1 can appear. It can be ZERO times also.
        System.out.println(str3.matches("[0-9A-F]+"));  // it will ensure that at least one time 01 is there.

        System.out.println(str4.matches("[0-9A-F]*"));   // it means as many times 0 or 1 can appear. It can be ZERO times also.
        System.out.println(str4.matches("[0-9A-F]+"));  // it will ensure that at least one time is there.

        // Checking DATE Format

        String date_format = "01/12/2000";
        System.out.println("Checking date format: ");
        System.out.println(date_format.matches("[0-3][0-9][/][0-1][0-9][/][0-3][0-9][0-9][0-9]"));
        System.out.println(date_format.matches("[0-3][0-9][/][0-1][0-9][/][0-9]{4}"));
        }
}