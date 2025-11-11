// Another formula for Area of Triangle is (s(s-a)(s-b)(s-c))^(1/2)
// s = (a + b + c)/2

import java.lang.*;
import java.util.Scanner;

class Video_031_HeronFormula_AreaOfTriangle
{
    public static void main (String args[])
    {
        float a, b, c, s, area;    //a, b, c are three sides of triangle
        

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please provide length of first side of the triangle: ");
        a = sc.nextFloat();
        
        System.out.println("Please provide length of second side of the triangle: ");
        b = sc.nextFloat();
        
        System.out.println("Please provide length of third side of the triangle: ");
        c = sc.nextFloat();

        s = (a+b+c)/2f;
        
        area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area of the triangle is: "+area);


    }

}