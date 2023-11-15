import java.io.*;
import java.lang.*;
import java.util.*;
class Addition
{
    public static void main(String args[])
    {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        a = sc.nextInt();
        System.out.print("Enter the second number : ");
        b = sc.nextInt();
        c = a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+c);
    }
}
