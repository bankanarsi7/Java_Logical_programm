// write a program to print the last occurance in given string
import java.util.Scanner;
class strings_last
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
      int index=str.lastIndexOf(ch);
      System.out.println("last occurance of a character" +ch+ "in astring" +str+ "is at index" +index);
    }
  }