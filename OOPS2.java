class Addition
{
   int a,b,c;
    
  void add()
  {
     a=10;
     b=20;
     c=a+b;
     System.out.println("The Addition value is:"+c);
  }
}
class OOPS2
  {
     public static void main(String args[])
    {
       Addition a1=new Addition();
       a1.add();
    }
}