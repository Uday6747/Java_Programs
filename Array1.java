// Example of how to create an dynamic array
import java.io.*;-
import java.lang.*;
import java.util.*;
class Array1
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of the array : ");
        size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("The elements in the array are : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("\nThe elements in reverse order are : ");
        for(int i = size-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}