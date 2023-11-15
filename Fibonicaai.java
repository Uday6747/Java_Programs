// To print Fibonicaai Series

import java.io.*;
import java.lang.*;
import java.util.*;
class Fibonicaai
{
    public static void main(String args[])
    {
        int a = 0, b = 1, s=0, i, n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=0;i<=n;i++)
        {
            System.out.print(" "+s);
            s = a+b;
            a = b;
            b = s;
        }
    }
}