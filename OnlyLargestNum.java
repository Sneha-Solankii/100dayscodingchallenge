import java.util.Scanner;

class  OnlyLargestNum
  {
    public static void main(String[]args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the a");
       int a=sc.nextInt();
    
       System.out.println("Enter the b");
       int b=sc.nextInt();

       System.out.println("Enter the c");
       int c=sc.nextInt();

   if(a>b && a>c)
       System.out.println(a+": is Largest");

   else if(b>a && b>c)

       System.out.println(b+": is Largest");

   else
       System.out.println(c+": is Largest");
  }
 }

       