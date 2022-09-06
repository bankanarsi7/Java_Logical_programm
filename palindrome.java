import java.util.Scanner;
class palindrome
  {
    public static void main(String args[])
    {
    int n,r=0,d,t;  
    Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      n=sc.nextInt();
      t=n;
      while(n>0)
        {
          d=n%10;
          r=r*10+d;
          n=n/10;
        }
      if(r==t)
        System.out.println("palindrome number");
      else
        System.out.println("not palindrome number");
    }             
  }