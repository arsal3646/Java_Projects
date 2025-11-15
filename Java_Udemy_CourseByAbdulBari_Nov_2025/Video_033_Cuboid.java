// Cuboid is rectangle with a height.
import java.lang.*;
import java.util.*;

class Video_033_Cuboid
{
    public static void main(String args[])
    {
        float length, breadth, height, volume, area, area_bottom, area_front, area_back;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter length");
        length = sc.nextFloat();

        System.out.println("Please enter breadth");
        breadth = sc.nextFloat();

        System.out.println("Please enter height");
        height = sc.nextFloat();

        area_bottom = 2 * length * breadth;
        area_front = 2 * height * breadth;
        area_back = 2 * height * length;
        
        area = area_back + area_bottom + area_front;
        volume = length * breadth * height; 

        System.out.println("Area is: "+area);
        System.out.println("Volume is: "+volume);
    }

}
