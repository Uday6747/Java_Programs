import java.io.*;

class Student
{
    static String collegeName = "DIET";

    Student(int r, String n)
    {
        rollNo = r;
        Name = n;
    }

    void show()
    {
        System.out.println(rollNo+" "+Name+" "+collegeName);
    }
}

class Test
{
    public static void main(String args[])
    {
        Student s1 = new Student(1, "Abhi");
        Student s2 = new Student(2, "Bhanu");
        s1.show();
        s2.show();
    }
}

/*
Output - 

D:\Programming\JAVA>javac Test.java 

D:\Programming\JAVA>java Test       
1 Abhi DIET
2 Bhanu DIET

*/
