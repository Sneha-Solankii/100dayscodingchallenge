class SumMultipleOfThre
 {
   public static void main(String[]args)
    {
      int i,sum=0;

      for(i=1; i<=40; i++)
        {
          if(i%3==0)
            {   
              
              sum = sum + i;

              System.out.println(i);
             }
         }
              
              System.out.println("Sum of Multiple of 3: " +sum);
     }

  }