import java.util.Scanner;
 
  class Multiples4Series
    {
      public static void main(String[]args)
       {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();

        int m=1,i;
        
        System.out.print(m+" ");
        for(i=1; i<=n; i++)
         {
           m = m+4;
         
           System.out.print(m+" ");
         }
       }
    }