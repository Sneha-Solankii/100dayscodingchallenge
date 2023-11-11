import java.util.Scanner;

  class SquareNterm
    {
      public static void main(String[]args)
       {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         int num=sc.nextInt();
         int sum=0,square;

      for(int i=1; i<=num; i++)
        {
          square=i*i;
         
          System.out.print(square+" ");
        }
         
       }
     }
