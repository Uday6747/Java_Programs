// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int x[] = new int[6];
        int y[] = new int[6];
		for(int i=0;i<a;i++)
		{
		    x[i] = in.nextInt();
            for(int j =0;j<i;j++)
            {
                y[j] = in.nextInt();
            }
		}
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i]);
        }
	}
}