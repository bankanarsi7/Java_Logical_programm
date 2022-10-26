class Thread1
{
   public static void main(String args[])
   {
         Thread t=Thread.currentThread();

         System.out.println("The Current Thread is :"+t);

         t.setName("Banka");

         System.out.println("The Current Thread is :"+t);
    }
}

// [Name of the Thread,Thread Priority, Type of the Thread]

// [main,5,main]

// [Banka,5,main]