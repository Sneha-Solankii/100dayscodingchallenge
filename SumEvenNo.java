class SumEvenNo
  {
    public static void main(String[]args)
      {
        int i=0,sum=0;

        while(i<=5)
         {
           if(i%2==0)
             {
               sum = sum + i;
             }
           i++;
         }
      System.out.println("Sum of even num:"+sum);
      }
   }