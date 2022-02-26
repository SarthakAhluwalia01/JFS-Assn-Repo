package com.company;


import java.util.HashSet;
import java.util.Set;

class Employees
{
    int empid,empSalary;
    String empName,empDept;
    public Employees(int empid,String empName, int empSalary, String empDept)
    {
        super();
        this.empid=empid;
        this.empName=empName;
        this.empSalary=empSalary;
        this.empDept=empDept;
    }


    @Override
    public String toString() {
        return "Employees [empid=" + empid + ", empSalary=" + empSalary + ", empName=" + empName + ", empDept=" + empDept + "]";
    }
}


public class Generics01 {
    public static void main(String[] args)
    {
        Employees e1=new Employees(121,"Sarthak",50000,"IT");
        Employees e2=new Employees(121,"Shruti",45000,"Pathology");
        Employees e3=new Employees(131,"Kajal",55000,"Gaming");
        Employees e4=new Employees(131,"Riya",78000,"Developer");
        Employees e5=new Employees(131,"Naman",85000,"Bank");
        Set<Employees> employees= new HashSet<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        for (Employees employees2 : employees) {
            System.out.println(employees2);

        }
    }
}
