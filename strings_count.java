import java.util.*;
class strings_count
  {
    public static void main(String args[])
    {
      String st1="Welcome@123&";
      int i,alpha=0,ALPHA=0,digit=0,sc=0;
      char ch;
      for(i=0;i<st1.length();i++)
        {
          ch=st1.charAt(i);
          if(ch>=65 && ch<=90)
            ALPHA++;
          else if(ch>=97 && ch<=120)
            alpha++;
          else if(ch>=48 && ch<=57)
            digit++;
          else
            sc++;
        }
      System.out.println("capital characters:"+ALPHA);
      System.out.println("small characters:"+alpha);
      System.out.println("digit characters:"+digit);
      System.out.println("special characters:"+sc);
    }
  }