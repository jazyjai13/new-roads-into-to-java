import java.util.Scanner;
//imports the scanner

public class MathTool{
  //class name

  public static void main(String[] args){
    //main mehtod
    Scanner input = new Scanner(System.in);
    //this decares the input as a scanner

    System.out.println("                .........................  ");
    System.out.println("                :                       :  ");
    System.out.println("                :    I N V E R S E S    :  ");
    System.out.println("                :                       :  ");
    System.out.println("                :.......................:  ");
    System.out.println("                             ");
    System.out.println("                HOW TO INPUT YOUR FUNCTION:  ");
    System.out.println("      -------------------------------------------------");
    System.out.println("              1. You may use up to five terms. ");
    System.out.println("  2. You may use addition, subtraction, multiplivation or division. ");
    System.out.println("         ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Welcome to the Math Tool! Enter the number of terms you will use");
    
    //all of this prints out a welcome splash screen

      int numTerm = input.nextInt();
    // has the user input number of terms

    System.out.println("enter the equation term by term");
    //tells the user to input trms
    
    Equation equation = new Equation();
    //creates new equation

    for(int i = 0; i < numTerm; i++){
      //adds number of terms user inputs
      System.out.println("give the coefficient");
      //prints out question
      int cof = input.nextInt();
      //has user input coefficient
      System.out.println("give the variable");
      //prints out question
      char var = input.next().charAt(0);
      //inuts user variable at (0)
      System.out.println("give the power");
      //prints out question
      int pow = input.nextInt();
      //inserts user power
      System.out.println("give the opperator");
      //prints out question
      char opperator = input.next().charAt(0);
      //inserts user opperator
      
      equation.addTerm(opperator, cof, var, pow);
      //adds the user inputed terms to equation
      
      System.out.println("enter in the next term");
      //prints out question
    }
    
    System.out.println(equation);
    //prints out final equation
    
  }
  
  
}