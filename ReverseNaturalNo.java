import java.util.*;
 
class ReverseNaturalNo
 {
   public static void main(String[]args)
    {
      Scanner sc = new Scanner(System.in);
      System.out .println("enter the num");
      int n=sc.nextInt();

      int i;

    for(i=1; n>=i; n--)
      {
        System.out.println(" Reverse Natural number:" +n);

      }
    }
  }