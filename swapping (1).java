import java.util.Scanner;

public class swapping {

//main method
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
  System.out.println("entre first number");
    int a=sc.nextInt();
  System.out.println("entre second number");
    int b=sc.nextInt();
    System.out.println("before swapping"+a+" "+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("after swapping"+a+" "+b);
  }
}