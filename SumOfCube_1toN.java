import java.util.*;
 
 class SumOfCube_1toN
   {
     public static void main(String[]args)
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        
        int sum=0,i,cube;
       
        for(i=1; i<=num; i++)
          {
            cube = i*i*i;
           
            sum = sum+cube;
          }
         System.out.println("Sum of cube = " +sum);
       }
     }