import java.util.Scanner;
 
  class Power3Series
    {
      public static void main(String[]args)
       {
         Scanner sc=new Scanner(System.in);
         System.out.print("Eneter the number: ");
         int n=sc.nextInt();
         int power=1;

         System.out.print(power+" ");

         for(int i=1; i<n; i++)
           {
             power =power*3;
            
             System.out.print(power+" ");
           }
       }
    }