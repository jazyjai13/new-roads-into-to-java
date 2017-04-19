public class DerivativeTester{
  //this makes DerivativeTester a class

  public static void main(String[] args){
    //this is the main method
    
    
    Equation e = new Equation();
    //this is so that it creates a new equation
     
    e.addTerm('+',2,'x',4);
    //this is the term input for the equation
    
    System.out.println(e.toString());
    //this prints out the equation
    
    Derivative in = new Derivative();
    // this creates the inverse
    
    in.setE(e);
    // this sets the equation to a list of variables
    
    System.out.println(in.getE().toString());
    //this prints out the eqaution order
    System.out.println(in.getDerivative());
    //this prints out the equation variables
  }
}