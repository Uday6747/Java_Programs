import java.io.*;
import java.lang.*;
import java.util.*;
class Exp
{
    public static void main(String args[])
    {
        StringBuilder s1 = new StringBuilder("java");
        String s2 = "Love";
        s1.append(s2);
        s1.substring(4);
        int foundAt = s1.indexOf(s2);
        System.out.println(foundAt);
    }
}