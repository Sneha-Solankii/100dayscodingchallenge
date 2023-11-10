import java.util.*;

  class SumOfNSquare
    {
       public static void main(String[]args)
         {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enetr the n number");
           int num = sc.nextInt();
 
           int square,i,sum=0;

           for(i=1; i<=num; i++)
             {
               square = i*i;
               System.out.println(i+" * "+i+" = "+square);

               sum = sum + square;

             }
               System.out.println("sum of square= "+sum);

          }
      }