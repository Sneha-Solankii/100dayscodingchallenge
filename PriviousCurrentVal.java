import java.util.Scanner;

  class PriviousCurrentVal
    {
      public static void main(String[]args)
       {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         int num=sc.nextInt();
          
         int privious=0, current;

      for(current=1; current<=num; current++)
        {
          System.out.print(privious);
          privious = privious + current;
         
          System.out.println("+"+current+"="+privious);
        }
         
       }
     }
