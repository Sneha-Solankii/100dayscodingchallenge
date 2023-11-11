import java.util.Scanner;

 class SumOddNumNTerm
   {
     public static void main(String[]args)
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entr the Number");
        int num=sc.nextInt();
        int sum=0,i;

        for( i=1; i<=num*2; i++)
          {
               if(i%2!=0){
                   System.out.print(i+" ");
                
                   sum=sum + i;
                 }
          }
             
         
               System.out.println("\nsum odd number: "+sum);
          
       }
   }
            