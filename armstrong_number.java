import java.util.Scanner;
class c20armstrong_number
  {
    public static void main(String args[])
    {
      int num,number,n,d,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number value");
      n=sc.nextInt();
      System.out.println("the armstrong number between 1 and"+n+"are");

      for(int i=1;i<n;i++)
        {
          number=i;
          sum=0;
          d=0;
          num=number;
          while(number>0)
            {
              d=number%10;
              sum=sum+(d*d*d);
              number=number/10;
            }
      
      if(sum==num)
      {
        System.out.println(num);
      }
      }
    }
  }