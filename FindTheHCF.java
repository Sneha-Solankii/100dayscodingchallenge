import java.util.*;

 class FindTheHCF
   {
     public static void main(String[]args)
      {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n1=sc.nextInt();

        System.out.print("Enter the number:");
        int n2=sc.nextInt();

        int HCF=0;

        for(int i=2; i<=n1 || i<=n2; i++)
         {
           if(n1%i==0 && n2%i==0)
            {
              HCF = i;
            }
         }
           System.out.print("HCF is:"+HCF);
      }
    }

         
        