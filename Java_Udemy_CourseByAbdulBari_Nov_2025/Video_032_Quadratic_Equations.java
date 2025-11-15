// a(x^2) + bx + c = 0     This is quadratic equation, i.e. highest degree is 2
// Our target is to find roots of this equation.
// Another way to write this equation is: (x + r1)*(x + r2) = 0
// Root r1 = (-b+(b^2 -4ac)^(1/2)) / 2a
// Root r2 = (-b-(b^2 -4ac)^(1/2)) / 2a

import java.lang.*;
import java.util.Scanner;

class Video_032_Quadratic_Equations
{
    public static void main(String args[])
    {
        double a, b, c, r1, r2, Discriminant;    // double because Math.sqrt returns double type.
   
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide non-zero integer of coefficient 'a':" );
        a = sc.nextInt();

        System.out.println("Please provide integer of coefficient 'b':" );
        b = sc.nextInt();

        System.out.println("Please provide integer of coefficient 'c':" );
        c = sc.nextInt();

        Discriminant = (b * b) - (4 * a * c);
        System.out.println("Discriminant is: "+Discriminant);

        r1 = (-b + Math.sqrt(Discriminant)) / (2*a);
        r2 = (-b - Math.sqrt(Discriminant)) / (2*a);
                
        System.out.println("The first root is: "+r1);
        System.out.println("The second root is: "+r2);

        if (Discriminant >= 0)
            {
                r1 = (-b + Math.sqrt(Discriminant)) / (2*a);
                r2 = (-b - Math.sqrt(Discriminant)) / (2*a);

                System.out.println("If statement - The first root is: "+r1);      // This is to see the effect with if statement and without if statement
                System.out.println("If statement - The second root is: "+r2);
            }
        else    
            {
                System.out.println("There is no real solution for the given quadratic equation.");
            }
    }

}