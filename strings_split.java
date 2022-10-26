// write a program to print the count of words in given string
import java.util.Scanner;
class strings_split
  {
    public static void main(String args [])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any string");
      String str=sc.nextLine();
      String[] words=str.split(" ");
      int count=0;
      for(int i=0;i<words.length;i++)
        {
          count++;
        }
      System.out.println("word count is:" +count);
    }
  }