import java.util.Scanner;

class FirstDigit
 {
  public static void main(String[]args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the two number digit ");
    int num=sc.nextInt();
  
   System.out.println("First number is=" +(num/10));

  }
}