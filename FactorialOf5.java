class FactorialOf5
  {
    public static void main(String[]args)
      {
         
         int  i, fact=1;

         for( i=1; i<=5; i++)
          {
            fact = fact * i;
          }
            System.out.println("Factorial of 5:" +fact);
      }
   }