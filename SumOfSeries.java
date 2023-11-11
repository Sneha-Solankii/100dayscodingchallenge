import java.util.Scanner;

 class SumOfSeries
  {
    public static void main(String[]args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the num");
       int num=sc.nextInt();
       int sum =0,k=0;

       for(int i=1; i<=num; i++)
         {
        
             k=k*10+2;
              System.out.print(k+" + ");
 
            sum=sum+k;
         }
           System.out.println("sum of series:" +sum);
      }
   }        