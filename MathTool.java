import java.util.Scanner;

public class MathTool{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("This is the Math Tool! Enter the number of terms you will use");

      int numTerm = input.nextInt();

    System.out.println("enter the equation term by term");
    
    Equation equation = new Equation();

    for(int i = 0; i < numTerm; i++){
      System.out.println("give the coefficient");
      int cof = input.nextInt();
      System.out.println("give the variable");
      char var = input.next().charAt(0);
      System.out.println("give the power");
      int pow = input.nextInt();
      System.out.println("give the opperator");
      char opperator = input.next().charAt(0);
      
      equation.addTerm(opperator, cof, var, pow);
      
      System.out.println("enter in the next term");
    }
    
    System.out.println(equation);
    
  }
  
  
}