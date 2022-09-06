import java.util.Scanner;
class ju_divis 
  {
    public static void main(String args[])
    {
      int n,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      n=sc.nextInt();

      for(int i=0; i<=n; i++)
        {
          if(i%2!=0)
          {
            continue;
          }
          if(i%3==0)
            sum=sum+i;
        }  
          System.out.println(sum);
    }
  }