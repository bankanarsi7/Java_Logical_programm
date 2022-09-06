import java.util.Scanner;
class vowlconsonent
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);

      System.out.println("enter any charector");
      ch=sc.next().charAt(0);

      if(ch=='A' || ch=='E' || ch=='I' || ch=='0' || ch=='U')
      {
        System.out.println("It is vowel");
        
      }
      else
      {
        System.out.println("It's consonent");
      }
    }
  }