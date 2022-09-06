import java.util.Scanner;
class week{
   public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      int n=sc.nextInt();

      if(n==1)
        System.out.println("It is monday");
      else if(n==2)
        System.out.println("It is tuesday");
      else if(n==3)
        System.out.println("It is wednesday");
      else if(n==4)
        System.out.println("It is thursday");
      else if(n==5)
        System.out.println("It is friday");
      else if(n==6)
        System.out.println("It is  saturday");
      else if(n==7)
        System.out.println("It is sunday");
      else
        System.out.println("No day");
    }
  }