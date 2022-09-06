import java.util.Scanner;
class while_fast
  {
    public static void main(String args[])
    {
      int n;
      int i=1;
      int c=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      n=sc.nextInt();
      while(i<=n)
        {
          if(n%i==0)
          {
            c++;
          }
          i++;
        }
      if(c==2)
        System.out.println("prime number");
      else
        System.out.println("not prime number");
    }
  }  