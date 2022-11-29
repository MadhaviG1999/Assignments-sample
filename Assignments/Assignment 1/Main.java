package Room1;

public class Main extends Employee
{
   public static void main(String[] args)
    {        
            Employee e = new Employee();
            e.fetch();
            e.designation();
             e.department(e.designation());
            e.GrossSalary();
            e.tax(e.basic_salary);
            e.net(e.basic_salary, e.tax);
            e.format();
        }
    }