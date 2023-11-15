// To display Employee information using objects 

import java.io.*;
import java.lang.*;
class Employee_Info
{
    int empid;
    String job;
    double salary;
    
    void setData(int eid, String j, double s)
    {
        empid = eid;
        job = j;
        salary = s;
        System.out.println("Employee ID : "+eid+"\nJob : "+j+"\nSalary : "+s);
    }
    public static void main(String args[])
    {
        Employee_Info e1, e2;
        e1 = new Employee_Info();
        e2 = new Employee_Info();
        e1.setData(11485, "Executive", 60000.00);
        e2.setData(11201, "Supervisor", 55000.00);
    }
}