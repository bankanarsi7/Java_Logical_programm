import java.util.Scanner;
class employee1
  {
    int empid;
    String name;
    float salary;
    Scanner sc=new Scanner(System.in);
    employee1()
    {
      System.out.println("Enter Employee id:");
      empid=sc.nextInt();
      System.out.println("Enter Employee name:");
      name=sc.next();
      System.out.println("Enter Employee salary:");
      salary=sc.nextFloat();
    }
    void disp()
    {
      System.out.println("Employee id is: "+empid);
      System.out.println("Employee name: "+name);
      System.out.println("Employee salary: "+salary);
    }
    void increasesalary()
    {
      System.out.println("salary increases to");
      salary = salary*(10/100);
      System.out.print(salary);
}
  }
class manager extends employee1
  {
    void depart()
    {
    String department;
    System.out.println("enter the department");
    department=sc.nextLine();
    }
  }
class employee
  {
    public static void main(String args[])
    {
      manager e=new manager();
      e.disp();
      e.increasesalary();
      e.depart();
    }
  }