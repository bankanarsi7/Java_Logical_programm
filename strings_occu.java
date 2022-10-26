// write a program to print the first occurance in given string
import java.util.Scanner;
class strings_occu
  {
    public static void main(String args [])
    {
      String str;
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any string");
      str=sc.nextLine();

      System.out.println("enter the charactetr");
      ch=sc.next().charAt(0);
      int index=str.indexOf(ch);
      System.out.println("first occurance of a character" +ch+ "in astring" +str+ "is at index" +index);
    }
  }