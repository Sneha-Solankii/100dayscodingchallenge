import java.util.Scanner;
public class LastDigitNum
 {
   public static void main(String[] args) 
    {
	   System.out.println("Please enter a number : ");
	   Scanner sc = new Scanner(System.in);
	   int num = sc.nextInt();
	
     System.out.println("The last digit of number is: "+(num%10));
}
}
