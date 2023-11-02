import java.util.Scanner; 

class CheckSquare
 {
   public static void main(String... args)
    {
      Scanner sc1=new Scanner(System.in);
      System.out.println("Enter the length");
      int length=sc1.nextInt();

       Scanner sc2=new Scanner(System.in);
      System.out.println("Enter the breadth");
      int breadth=sc2.nextInt();

  if(length==breadth)
     System.out.println("It is a square");

  else
     System.out.println("IT is not a square");

 }
}

      
  