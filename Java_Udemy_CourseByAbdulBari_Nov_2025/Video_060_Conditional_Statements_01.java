// topics include relational operaters and conditional statements
import java.lang.*;
import java.util.Scanner;

class Video_060_Conditional_Statements_01
{
    public static void main(String args[])
    {
        int a=5, b=10, c=15;

        // relational operators will compare the data and retun true or false

        System.out.println(a<b);
        System.out.println(a>b);

        System.out.println(a==b);
        System.out.println(a!=b);

        System.out.println(a<b && a<c);
        System.out.println(a<b || a<c);

        System.out.println(a>b && a<c);
        System.out.println(a>b || a<c);

        // check if a number is positive or not

        int n = 0;

        if (n>=0)
        {
            System.out.println("The given number is non-NEGATIVE.");
        }
        
        else
        {
            System.out.println("The given number is NEGATIVE.");
        }

        // Check which number is greatest of the above three variables

        if (a>b && a>c)
        {
            System.out.println(a+" is the greatest number.");
        }
        else if (b>c)
        {
            System.out.println(b+" is the greatest number.");
        }
        else
        {
            System.out.println(c+" is the greatest number.");
        }

    }
}