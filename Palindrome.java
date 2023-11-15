import java.io.*;
import java.lang.*;
import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        int num, temp, sum=0, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is a palindrome or not : ");
        num = sc.nextInt();
        temp=num;
        while(temp>0)
        {
            r = temp%10;
            sum = (sum*10)+r;
            temp = temp/10;
        }
        if(sum==num)
        {
            System.out.println("The given number is a Palindrome.");
        }
        else
        {
            System.out.println("The given number is not a Palindrome.");
        }
    }
}