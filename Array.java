// Example of how to create an integer array
import java.io.*;
import java.lang.*;
import java.util.*;
class Array
{
    public static void main(String args[]) throws IOException
    {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("The elements in the array are : ");
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}