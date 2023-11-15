// To take the input from the user

import java.io.*;
import java.util.Scanner;

class Input1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a;
        a = sc.nextInt();
        System.out.println("The enterd number is "+a);
    }
}