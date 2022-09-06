import java.util.Scanner;
class array_max
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i,n,min,max;
      System.out.println("enter array size:");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter elements to array:");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("the elements in an array is:");
      for(i=0;i<n;i++)
        {
          System.out.println("the a["+i+"] value is:"+a[i]);
        }
      min=a[0];
      max=a[0];
      for(i=0;i<n;i++)
        {
          if(min>a[i])
            min=a[i];
          if(max<a[i])
            max=a[i];
        }
      System.out.println("the minimum value in array is:"+min);
      System.out.println("the maximum value in array is:"+max);
    }
  }