import java.util.Scanner;
class natural_numbers
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
      n=sc.nextInt();
      int i=1;
      do
        {
          System.out.println(i);
          i++;
        }
        while(i<n);
    }
  }