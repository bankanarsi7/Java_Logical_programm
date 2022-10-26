class STRINGS1
  {
  public static void main(String arg[])
    {
      String st1="WELCOME";

      System.out.println("the Reverse of given string is:");

      for(int i=st1.length();i>0;i--)
        {
          System.out.print(st1.charAt(i-1));
        }
    }
  }