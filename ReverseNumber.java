import java.io.*;
import java.lang.*;
import java.util.*;
class ReverseNumber
{
    public static void main(String args[])
    {
        String str, str1="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        str = sc.nextLine();
        for(int i=str.length()-1;i>=0;i--)
        {
            str1=str1+str.charAt(i);
        }
        System.out.println("The reverse of the given string is : "+str1);
    }
}