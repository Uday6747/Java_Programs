import java.io.*;
import java.lang.*;
import java.util.*;

class A
{
  public int a = 10;
  int b = 20, c = a+b;
  void show()
  {
    System.out.println("Value of a inside the method of the class : "+a);
    System.out.println("Result of c : "+c);
  }
}

class B(A)
{
 void display()
 {
  System.out.println("Value of a in another class : "+a);
 }
}

class Exp1
{
  public static void main(String args[])
  {
    A obj1 = new A();
    obj1.show();
    System.out.println("Value of a accessing through object : "+obj1.a);

    B obj2 = new B();
    obj2.display();
  }
}
