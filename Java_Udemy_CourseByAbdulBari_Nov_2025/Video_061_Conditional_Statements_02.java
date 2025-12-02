// Student Challenge: Find a number if ODD or EVEN
// Student Challenge: Find a person is young or not
// Student Challenge: Find grades for given marks

import java.lang.*;
import java.util.Scanner;

class Video_061_Conditional_Statements_02
{
    public static void main(String args[])
    {
        System.out.println("Please enter an integer.");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if((n % 2) == 0)
        {
            System.out.println("The given number is an even number.");
        }
        else
        {
            System.out.println("The given number is an odd number.");
        }

        System.out.println("Please enter a LONG number.");
        long m = sc.nextLong();

        System.out.println("Please enter a FLOAT number.");
        float o = sc.nextFloat();

        System.out.println("Please enter a SHORT number.");
        short p = sc.nextShort();

        System.out.println("Please enter a BYTE number.");
        byte q = sc.nextByte();

        System.out.println(n+" & "+m+" & "+o+" & "+p+" & "+q);

        System.out.println("The sum of all these numbers is "+(n+m+o+p+q));
        System.out.println("The average of all these numbers is "+(n+m+o+p+q)/5);
    }
}