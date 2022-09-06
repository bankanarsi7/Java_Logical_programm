import java.util.Scanner;
class digits
  {
    public static void main(String args[])
    {
      int n,d=0,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      n=sc.nextInt();

      while(n>0)
        {
          d=n%10;
          sum=sum+d;
          n=n/10;
        }
      System.out.println("the sum positive integer is"+sum);
    }
  }