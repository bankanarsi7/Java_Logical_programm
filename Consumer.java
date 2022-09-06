import java.util.Scanner;
  class Consumer
  {
    public static void main(String args [])
    {
      int cno;
      String cname;
      int pmr;
      int lmr;
      double bill=0;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("The Given CUS Number is:");
      cno=sc.nextInt();
      System.out.println("The Given CUS Name is:");
      cname=sc.next();
      System.out.println("The Given PRESENT MONTH READING is:");
      pmr=sc.nextInt();
      System.out.println("The Given LAST MONTH READING is:");
      lmr=sc.nextInt();
      
      int tu;
      tu=pmr-lmr;
      
      
      
      System.out.println("The Given CUS Number is:"+cno);
      System.out.println("The Given CUS Name is:"+cname);
      System.out.println("The Given PRESENT MONTH READING is:"+pmr);
      System.out.println("The Given LAST MONTH READING is:"+lmr);
       if(tu<=50)
      {
       bill=tu*3.40;
        
      }
      else if(tu<=100)
      {
        bill=50*3.40+(tu-50)*4.56;
       
      }
      else if(tu<=200)
      {
        bill=50*3.40+50*4.56+(tu-100)*5.43;
        
      }
      else if(tu<=300)
      {
        bill=50*3.40+50*4.56+100*5.43+(tu-200)*6.54;
        
      }
      else if(tu>300)
      {
        bill=50*3.40+50*4.56+100*5.43+200*6.54+(tu-300)*7.54;
        
      }
      else
      {
      
      }
    }
  }