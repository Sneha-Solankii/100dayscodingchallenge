import java.util.Scanner;
class Vote
 {
   public static  void main(String[]args)
     {
       Scanner Vote=new Scanner(System.in);
       System.out.println("enter the age");
       int age = Vote.nextInt();

       if(age>=18)

          System.out.println(age+" Yes");

       else

          System.out.println(age+" No");
     }
  } 