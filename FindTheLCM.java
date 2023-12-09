import java.util.*;
 
  class FindTheLCM
   {
     public static void main(String[]Args)
      {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the number:");
        int n1=sc.nextInt();

        System.out.print("Enetr the number:");
        int n2=sc.nextInt();

        int big =(n1>n2)? n1:n2;

        for(int LCM=big; LCM<=n1*n2; LCM++)
         {
           if(LCM%n1==0 && LCM%n2==0)
             {
                System.out.print("LCM is :"+LCM);
                break;
             }
          }
      }
   }        