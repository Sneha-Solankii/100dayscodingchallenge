class FirstOf13EvenNo
 {

    public static void main(String[]args)
     {
       
      int sum=0,i;
 
      for(i=0; i<=13; i++)
        {
          if(i%2==0)
            {
              sum = sum +i;
            }
        }
              System.out.println("Sum of even no.:" +sum);
        
      }
   }