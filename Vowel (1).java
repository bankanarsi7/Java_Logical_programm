import java.util.Scanner;
class Vowel
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      ch=sc.next().charAt(0);

      if(ch=='A')
        System.out.println("Its Vowel");
      else if(ch=='E')
        System.out.println("Its Vowel");
      else if(ch=='I')
        System.out.println("Its Vowel");
      else if(ch=='O')
        System.out.println("Its Vowel");
      else if(ch=='U')
        System.out.println("Its Vowel");
      else
        System.out.println("Its consonent");
    }
  }