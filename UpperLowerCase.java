

import java.util.Scanner;

class UpperLowerCase
 {
   public static void main(String[]args)
    { 
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the alphabate");
      char ch= sc.next().charAt(0);
 
    if(ch>='A'&& ch<='Z')
 
       System.out.println(ch+"=is Uppercase Alphabate");

   else  if(ch>='a'&& ch<='z')
 
       System.out.println(ch+"= is Lowercase Alphabate");
    
    else
      
       System.out.println(ch+"= it is not alphabate");
   }
}