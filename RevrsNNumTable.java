import java.util.*;

 class RevrsNNumTable
   {
     public static void main(String[]args)
       {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the given number");
         int num =  sc.nextInt();
         
         int i , table ;
              
          
          for(i=10; i>=1; i--)
            { 
               table = num * i;
            
              System.out.println(num+" * "+i+" = "+table);
       }
      }
    }
 