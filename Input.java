// To read two input from the user
import java.io.*;
import java.util.*;
import java.lang.*;
class Input
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a value : ");
        a = sc.nextInt();
        System.out.print("Enter the b value : ");
        b = sc.nextInt();
        System.out.println("Sum of "+a+" and "+b+" = "+(a+b));
    }
}