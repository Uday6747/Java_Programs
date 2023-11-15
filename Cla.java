// First program
// To add two integer numbers using command line arguments

import java.io.*;
import java.lang.*;
class Cla
{
    public static void main(String args[])
    {
        int a, b, sum;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        sum = a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+sum);
    }
}