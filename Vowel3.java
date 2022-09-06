import java.util.Scanner;
class Vowel3
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      ch=sc.next().charAt(0);
      if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
      {
        switch(ch)
          {
            case 'A': case 'a':
            case 'E': case 'e':
            case 'O': case 'o':
            case 'I': case 'i':
            case 'U': case 'u':
              System.out.println("Its Vowel");
              break;
              default:
              System.out.println("Its consonent");
          }
      }
      else
        System.out.println("alphabets only");

      if(ch>='A' && ch<='Z')
      {
        System.out.println("Its capital letter");
      }
      else if(ch>='a' && ch<='z')
      {
        System.out.println("Its small latter");
      }
      else if(ch>='0' && ch<='9')
      {
        System.out.println("ITS digit");
      }
      else
        System.out.println("Its special character");
    }
  }