import java.util.*;

 class SumMultipleOf7_1toN
   {
     public static void main(String[]args)
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        int sum=0,i;

        for(i=1; i<=num; i++)
          {
            if(i%7==0)
              {
                sum=sum+i;
              }
          }
                System.out.println("sum of multiple = " +sum);
       }
    }
