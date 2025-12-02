// Student Challenge: Find RADIX or a number given in a string

import java.lang.*;
import java.util.Scanner;

class Video_062A_Radix
{
    public static void main(String args[])
    {
      // A number is given in a form of a string.
    
        Scanner sc = new Scanner(System.in);

        String number1 = "1010110"; // binary number 0,1
        String number2 = "12357";   // octal number  0-7
        String number3 = "A25B";    // hexadecimal number 0-9A-F
        String number4 = "25978";    // decimal number 0-9

        System.out.println("Please enter a number number: ");
        String num = sc.nextLine();

        if(num.matches("[01]+"))
        {
            System.out.println("Radix (base) = 2");
        }     
        else if(num.matches("[0-7]+"))
        {
            System.out.println("Radix (base) = 8");
        }
        else if(num.matches("[0-9]+"))
        {
            System.out.println("Radix (base) = 10");
        }
        else if(num.matches("[0-9A-F]+"))
        {
            System.out.println("Radix (base) = 16");
        }
     
        else
        {
            System.out.println("This is an invalid input.");
        }

    }
}