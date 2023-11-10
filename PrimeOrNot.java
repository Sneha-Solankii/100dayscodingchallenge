import java.util.*;

 class PrimeOrNot
   {
     public static void main(String[]args)
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();

        int i,temp=0;

        for(i=2; i<n; i++)
          {
            if(n%i == 0)
              {
                temp =1;
                break;
              }
          }
            if(temp  == 0)
              
              System.out.println("Number is Prime");
            
            else

               System.out.println("Number is not Prime");
        }
     }

    
    