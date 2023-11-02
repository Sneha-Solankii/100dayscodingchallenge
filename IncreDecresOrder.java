import java.util.Scanner;

class IncreDecresOrder
 {
   public static void main(String... args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the 1st num");
      int First=sc.nextInt();

      System.out.println("Enter the 2nd num");
      int Second=sc.nextInt();

      System.out.println("Enter the 3rd num");
      int Third=sc.nextInt();
 
      
      if((First <= Second) && (Second <= Third))
     System.out.println("Number is Increasing Order");
 
  else
     System.out.println("Number is Decreasing Order");
 }
}

     

 