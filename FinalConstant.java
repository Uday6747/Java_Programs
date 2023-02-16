// To demonstrate "final" keyword usage

import java.io.*;
import java.lang.*;
import java.util.*;
class FinalConstant
{
    public static void main(String args[])
    {
        final int a=2;
        a++;
        System.out.println(a);
    }
}

/*
Output :-
D:\Programming\JAVA>javac FinalConstant.java
FinalConstant.java:11: error: cannot assign a value to final variable a
        a++;
        ^
1 error
*/