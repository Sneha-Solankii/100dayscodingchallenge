import java.util.*;

  class NSumOfnum
    {
      public static void main(String[]args)
        {
          Scanner sc = new Scanner(System.in);
          System.out.println("Eneter the n Number ");
          int num=sc.nextInt();

           int sum=0, i;

          for(i=0; i<=num; i++)
            {
              sum=sum+i;
            } 
              System.out.println("Sum of All numbers:" +sum);
         }
     }  