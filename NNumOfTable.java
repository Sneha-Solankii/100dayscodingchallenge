import java.util.*;

 class NNumOfTable
   {
     public static void main(String[]args)
       {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the given number");
         int num =  sc.nextInt();
         
         int i , table ;
              
          
          for(i=1; i<=10; i++)
            { 
               table = num * i;
            
              System.out.println(num+" * "+i+" = "+table);
       }
      }
    }
 
      