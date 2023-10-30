import java.util.Scanner;

class OneDaySalary
{
   public static void main(String[]args)
 {
   Scanner one=new Scanner(System.in);
   System.out.println("Enter your monthly salary");
   int MonthlySalary = one.nextInt();

   System.out.println("one day salary=" +(MonthlySalary/30));
  }
}