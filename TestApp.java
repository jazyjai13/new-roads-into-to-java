import java.util.Scanner;

//this is a java class
public class TestApp{
  //this is the main method
  //where the application starts
  public static void main(String[] args){
    
    //these are examples of data types
    
    /*int x = 3;
    double number = 3.0;
    String word = "asdfghjkl!@";
    char letter = 'x';
    */
    
    Scanner input = new Scanner(System.in);
      
     System.out.println("Enter 3 numbers: ");
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();
    double num3 = input.nextDouble();
    
    double average = (num1 + num2 + num3)/3;
    
    System.out.println("this is average" + average);
    
  }
}