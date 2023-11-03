import java.util.Scanner;

class TwoDigitNum
 {
   public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the two digit number");
      int two=sc.nextInt();

       if(two>=10 && two<=99)

         System.out.println("the First digit is=" +(two/10));

       else

         System.out.println("Number  is incorrect");

    }
  }