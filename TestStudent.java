import java.util.Scanner;

public class TestStudent{
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
  
  System.out.println("Enter your name: ");
  
  String name = input.next();
    
  System.out.println("Your name is" + name);
  
  System.out.println("What year do you graduate?");
  
  int graduationYear = input.nextInt();
  
  System.out.println("Year of graduation: " + graduationYear);
    
    String classes = "";
    
    if(graduationYear == 17)
    {
      classes = "Senior";
    }
    else if(graduationYear == 18)
    {
      classes = "Junior";
    }
    else if(graduationYear == 19)
    {
      classes = "Sophomore";
    }
    else
    {
    classes = "Freshmen";
    }
  
  System.out.println("You are a" + classes);
    
  }    
}