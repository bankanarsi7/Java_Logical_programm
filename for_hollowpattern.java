import java.util.Scanner;
class for_hollowpattern
  {
    public static void main(String args[])
    {
      int size=5;
      int i,j;

      for(i=0;i<size;i++)
        {
          for(j=0;j<size;j++)
            {
              if(i==0 || i==size-1)
              {
                System.out.print("*");
              }  
              else
              {
                if(j==0 || j==size-1)
                {
                  System.out.print("*");
                }
                else
                {
                  System.out.print(" ");
                }
              }
            }
          System.out.println();
        }
    }
  }