import java.util.Scanner;

class checkCharacter
 {
   public static void main(String... args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Character number");
      char ch=sc.next().charAt(0) ;
  
  if(ch>='a' || ch<='z' || ch>='A' || ch<='Z')
   
      System.out.println("It is Alphabate");

  else if(ch>='0' || ch<='9')

      System.out.println("It is Digit");
 
  else 
   
      System.out.println("It is Special symbole");

 }
}
 