import java.io.*;
import java.lang.*;
import java.util.*;
class Fibonnica
{
    public static void main(String args[])
    {
        int num, sum=1;
        int n1=0, n2=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        System.out.print(n1+" "+n2);
        for(int i=0;i<=num;i++)
        {
            n1=n2;
            n2=sum;
            sum=n1+n2;
            System.out.print(" "+sum);
        }
    }
}