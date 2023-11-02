import java.util.Scanner;

class CompanyBonus
 {
   public static void main(String... args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the joining year");
      int year=sc.nextInt();

  if (year>=5)
     
     {
    
       System.out.println("Enter the salary");
       float salary=sc.nextFloat();
 
       System.out.println("you are bonus ammout is=" +(salary*5)/100);
     }

  else 
       
       System.out.println("Sorry you are not eligible for net bonus"); 

  }
}