package Room1;

import java.util.Scanner;

public class Employee
{
    String ename;
    int dept;
    String design;
    int salary;
    String temp;
    int n;
    double basic_salary;
    double da;
    double hra;
    double GrossPayment;
    double tax;
    Scanner sc = new Scanner(System.in);
    
public void fetch()
{
    
    System.out.println("Enter the name");
    ename =sc.next();
    System.out.println("Enter the allowance");
     n = sc.nextInt();
}
    
public int designation()
{
    
    
        if(n==1600)
        {
            temp="PL";
            System.out.println(temp);
        }
        else if (n==1300)
        {
            temp="TM";
            System.out.println(temp);
        }
        else if (n==1270)
        {
            temp="TL";
            System.out.println(temp);
        }
        else if (n==1500)
        {
            temp="ADMIN";
            System.out.println(temp);
        }
        else
        {
            temp="Others";
            System.out.println(temp);
        }
        return n;
}
        
public void department(int n)
{
    dept=1500;
    if(dept==n)
    {
        System.out.println("Dept = Admin");
    }
    else
    {
        System.out.println("Dept = tech");
    }
}
public double GrossSalary()
{
    System.out.println("Enter Basic Salary Of Employee: ");
      basic_salary=sc.nextInt();



     System.out.println("Enter Basic DA Of Employee: ");
      double da1=sc.nextFloat();
     
      System.out.println("Enter Basic HRA Of Employee: ");
     double hra1=sc.nextFloat();



     da = (da1 * basic_salary) / 100;
      hra = (hra1 * basic_salary) / 100;



     GrossPayment = basic_salary + da + hra;
      System.out.println("Gross Salary Of Employee: "+GrossPayment);
      return GrossPayment;
}
public double tax(double salary)
{
    if(salary>=20000)
    {
        tax =salary*13/100;
        System.out.println("tax " +tax);
        System.out.println();
    }
    else if (salary>15000 && salary<20000)
    {
        tax=salary*12.5/100;
        System.out.println("tax " +tax);
    }
    else if(salary>12500 && salary<14999)
    {
        tax=salary*11.25/100;
        System.out.println("tax " +tax);
    }
    else if(salary>7500 && salary<12499)
    {
        tax=salary*9.6/100;
        System.out.println("tax " +tax);
    }
    else
    {
        System.out.println("tax "+"0");
    }
    return tax;
}
public double net(double salary,double a)
{
    double sub = salary - a;
    return sub;
}
public void format()
{
//System.out.println("Employee name : "+ename+": basic salary : "+basic_salary+ " Gross Payment : "+GrossPayment+ " Net Salary = "+net(basic_salary, tax));
System.out.println("Employee name   Emp basic       Emp gross       Emp net");
System.out.println( ename+"          "+basic_salary+"         "+GrossPayment+"         "+net(basic_salary, tax)   );
}
}