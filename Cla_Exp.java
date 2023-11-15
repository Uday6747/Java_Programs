// An example of implementing Command-Line Arguments

import java.io.*;
import java.util.*;
import java.lang.*;
class Cla_Exp
{
    public static void main(String args[])
    {
        
        int n = args.length;
        for(int i = 0; i<n; i++)
        {
            System.out.println(args[i]);
        }
    }
}

/*
Output :-
D:\Programming\JAVA>javac Cla_Exp.java

D:\Programming\JAVA>java Cla_Exp 1 "A" "Ramu" 10.5
1
A   
Ramu
10.5
*/