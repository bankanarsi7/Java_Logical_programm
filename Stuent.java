import java.util.Scanner;
  class Stuent
  {
    public static void main(String args [])
    {
      int sno;
      String sname;
      int ssub1;
       int ssub2;
       int ssub3;
      
      Scanner sc=new Scanner(System.in);
      
      System.out.println("The Given STUDENT Number is:");
      sno=sc.nextInt();
      System.out.println("The Given STUDENT Name is:");
      sname=sc.next();
      System.out.println("The Given SUBJECT_1 MARKS is:");
      ssub1=sc.nextInt();
       System.out.println("The Given SUBJECT_2 MARKS is:");
      ssub2=sc.nextInt();
       System.out.println("The Given SUBJECT_3 MARKS is:");
      ssub3=sc.nextInt();

      int to;
      to=ssub1+ssub2+ssub3;
      double avg;
      avg=(to/3);
        
      System.out.println("The Given STUDENT Number is:"+sno);
      System.out.println("The Given STUDENT Name is:"+sname);
      System.out.println("The Given SUBJECT_1 MARKS is:"+ssub1);
      System.out.println("The Given SUBJECT_2 MARKS is:"+ssub2);
      System.out.println("The Given SUBJECT_3 MARKS is:"+ssub3);
      System.out.println("The Given VALUE OF TOTAL is:"+to);
      System.out.println("The Given Average is:"+avg);
    
     if(ssub1>40 && ssub2>40 && ssub3>40)
     {
       
       System.out.println("Result:pass");
     
      if(avg<50)
        System.out.println("grade:C");
      else if(avg>=50 && avg>70)
        System.out.println("grade:B");
      else if(avg>=70 && avg>80)
        System.out.println("grade:A");
      else if(avg>80)
        System.out.println("Student pass in distension");
     }
      else{
        System.out.println("Result:Fail");
      }
        
    }
  }