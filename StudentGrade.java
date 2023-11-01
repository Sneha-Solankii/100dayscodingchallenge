import java.util.Scanner;

class StudentGrade
  {
    public static void main(String... args)
      {
        Scanner input1=new Scanner(System.in);
        System.out.println(" Enter the total marks of Student1");
        int stud1=input1.nextInt();
   
        Scanner input2=new Scanner(System.in);
        System.out.println(" Enter the total marks of Student2");
        int stud2=input2.nextInt();
    
        Scanner input3=new Scanner(System.in);
        System.out.println(" Enter the total marks of Student3");
        int stud3=input3.nextInt();
    
     //For Student 1

        if(stud1>=0 && stud1<=40)
            System.out.println("Student1 grade is C:" +stud1);
        
        else if(stud1>=41 && stud1<=75)
            System.out.println("Student1 grade is B:" +stud1);

        else if(stud1>=76 && stud1<=100)
            System.out.println("Student1 grade is A:" +stud1);

     //For Student 2

        if(stud2>=0 && stud2<=40)
            System.out.println("Student2 grade is C:" +stud2);
        
        else if(stud2>=41 && stud2<=75)
            System.out.println("Student2 grade is B:" +stud2);

        else if(stud2>=76 && stud2<=100)
            System.out.println("Student2 grade is A:" +stud2);


     // For Student 3
   
        if(stud3>=0 && stud3<=40)
            System.out.println("Student3 grade is C:" +stud3);
        
        else if(stud3>=41 && stud3<=75)
            System.out.println("Student3 grade is B:" +stud3);

        else if(stud3>=76 && stud3<=100)
            System.out.println("Student3 grade is A:" +stud3);
       
       }
  }