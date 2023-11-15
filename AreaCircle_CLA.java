// Second Program
// To find the area of a circle using Command Line Arguments

import java.io.*;
import java.lang.*;
class AreaCircle_CLA
{
    public static void main(String args[])
    {
        float radius, area;
        radius = Float.parseFloat(args[0]);
        area = (float)22/7*radius*radius;
        System.out.println("The area of circle with radius "+radius+" is "+area);
    }
}