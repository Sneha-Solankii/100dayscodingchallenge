import java.util.Scanner;
class  Distinct3Sub
 {
   public static void main(String[]args)
    {
      Scanner sub1=new Scanner(System.in);
      System.out.println("enter the Englsh marks");
      double Englishmarks = sub1.nextInt();

      Scanner sub2=new Scanner(System.in);
      System.out.println("enter the Maths marks");
      double Mathsmarks = sub2.nextInt();

      Scanner sub3=new Scanner(System.in);
      System.out.println("enter the Hindi marks");
      double Hindimarks = sub3.nextInt();

  if(Englishmarks >=75)
      
     System.out.println("hey you got distinct in English=" +Englishmarks); 
     
  
  if(Mathsmarks >=75)
      
     System.out.println("hey you got distinct in Maths=" +Mathsmarks); 
   
  
  if(Hindimarks >=75)
      
     System.out.println("hey you got distinct in Hindi=" +Hindimarks); 
    
 
 }
}     