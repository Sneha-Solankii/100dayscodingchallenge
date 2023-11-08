import java.util.Scanner;

class NofAverageNo
 {
   public static void main(String[]args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Eneter the number for print number of average number");
      int num = sc.nextInt();
  
      float avrg = 0;

   for(int i=0; i<=num; i++)
     {
        avrg = avrg + i;
     }
        System.out.println("Average of n number:" +avrg/num);

   }
}