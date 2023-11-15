import java.io.*;

class Add
{
  int a, b, c;
  void add(int a, int b)
  {
    c = a+b;
  }
  void display()
  {
    System.out.println(c);
  }
}

class Function
{
  public static void main(String[] args)
  {
    Add obj = new Add();
    obj.add(10, 20);
    obj.display();
  }
}
