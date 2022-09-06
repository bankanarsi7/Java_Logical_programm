import java.util.Scanner;
class Integer
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
       System.out.println("enter n value");
       n=sc.nextInt();
      switch(n)
        {
          case 1:
            int l,b,area;
            System.out.println("length of rectangle is");
            int L=sc.nextInt();
            System.out.println("bredth of rectangle is");
            int B=sc.nextInt();
            area=L*B;
            System.out.println("area of rectangle"+area);
            break;
          case 2:
            int a;
            System.out.println("enter the year");
            a=sc.nextInt();
              
            if (a%400==0)
            {
              if(a%100==0)
              System.out.println("given year is leap year");
              else
               System.out.println("given year is not leap year");
            }
            else
            {
              if(a%4==0)
                System.out.println("given year is leap year");
              else
                System.out.println("hiven year is not leap year");
            }
            break;
          case 3:
            int num1;
            int num2;
            int num3;
            double avg;
            System.out.println("enter first number");
            num1=sc.nextInt();
            System.out.println("enter second number");
            num2=sc.nextInt();
            System.out.println("enter third number");
            num3=sc.nextInt();
            avg=(num1+num2+num3)/3;
            System.out.println("average of three number is"+avg);
            break;
          default:
            System.out.println("not found");
       }
    }
  }