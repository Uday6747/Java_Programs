// To show the constructor working and also the object instantiation

import java.io.*;
import java.lang.*;
class Distance
{
    int feet;
    double inches;
    Distance()
    {
        feet = 0;
        inches = 0;
    }
    void setdata(int f, double i)
    {
        feet = f;
        inches = i;
        System.out.println("I am in setdata() function.");
        System.out.println("Feet : "+feet+"\nInches : "+inches);            
    }
    public static void main(String args[])
    {
        // Object can also be created in single line
        // Distance d = new Distance();
        Distance d;
        d = new Distance(); // Constructor allocates memory space
        // d.feet = 10; --> Cannot be accessed
        // d.inches = 6.5; --> cannot be accessed
        d.setdata(10, 6.521);
    }
}