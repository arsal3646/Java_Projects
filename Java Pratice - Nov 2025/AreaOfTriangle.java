// Area of a triangle = (b x h)/2

import java.lang.*;
import java.util.Scanner;

class AreaOfTriangle

{
public static void main(String args[])
{
float base, height, area1, area2, area3;

System.out.println("Please enter base of the triangle: ");
Scanner sc = new Scanner(System.in);
base = sc.nextFloat();

System.out.println("Please enter height of the triangle: ");
Scanner sc = new Scanner(System.in);
height = sc.nextFloat();

area1 = (base * height)*0.5f;   // f is must for float
area2 = (1/2)*(base * height); // this will give wrong output because 1/2 will be treated as integers and will evaluate to zero
area3 = (1/2)*(base * height); // mistake is fixed

System.out.println("Area1 of the given triangle is: "+area1);
System.out.println("Area2 of the given triangle is: "+area2);
System.out.println("Area3 of the given triangle is: "+area3);
}

}


