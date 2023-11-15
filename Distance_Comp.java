// Did not get executed

import java.io.*;
import java.lang.*;
class Distance_Comp
{
    int feet;
    double inches;
    Distance_Comp()
    {
        feet = 0;
        inches = 0.0;
    }
    void setdata(int f, double i)
    {
        feet = f;
        inches = i;
    }
    void Compare(Distance_Comp d)
    {
        if (feet > d.feet)
        {
            System.out.println(feet);
        }
        else
        {
            System.out.println(d.feet);
        }
    }
    public static void main(String args[])
    {
        Distance_Comp d1, d2;
        d1 = new Distance_Comp();
        d2 = new Distance_Comp();
        d1.setdata(10, 5.5); // Passing values
        d2.setdata(7, 3.3); // Passing objects
    }
}