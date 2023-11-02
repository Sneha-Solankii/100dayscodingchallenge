import java.util.Scanner;

class CheckAngleTriangle
 {
   public static void main(String... args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enetr the angle1");
      int angle1=sc.nextInt();

     System.out.println("Enetr the angle2");
      int angle2=sc.nextInt();

     System.out.println("Enetr the angle3");
      int angle3=sc.nextInt();

  if(angle1 + angle2 + angle3 == 180)

    System.out.println("Triangle is valid ");

  else 

    System.out.println("Triangle is not valid");

  }
 }
   