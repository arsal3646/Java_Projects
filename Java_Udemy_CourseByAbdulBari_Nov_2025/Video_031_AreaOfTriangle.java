// Area of a triangle = (b x h)/2

import java.lang.*;
import java.util.Scanner;

class Video_031_AreaOfTriangle

{
public static void main(String args[])
{
float base, height, area1, area2, area3;

System.out.println("Please enter base of the triangle: ");
Scanner sc_base = new Scanner(System.in);
base = sc_base.nextFloat();

System.out.println("Please enter height of the triangle: ");
Scanner sc_height = new Scanner(System.in);
height = sc_height.nextFloat();

area1 = (base * height)*0.5f;   // f is must for float
area2 = (1/2)*(base * height); // this will give wrong output because 1/2 will be treated as integers and will evaluate to zero
area3 = (1f/2f)*(base * height); // mistake is fixed

System.out.println("Area1 of the given triangle is: "+area1);
System.out.println("Area2 of the given triangle is: "+area2);
System.out.println("Area3 of the given triangle is: "+area3);
}

}


