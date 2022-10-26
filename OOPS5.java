class Factorial
{
   int n,f;
    
  void fact(int x)
  {
    n=x;
    f=1;
    for(int i=1;i<=n;i++)
      {
        f=f*i;
      }
     System.out.println("The Factorial value is:"+f);
  }
}
class OOPS5
  {
     public static void main(String args[])
    {
      int m=4;
       Factorial f=new Factorial();
       f.fact(m);
    }
}