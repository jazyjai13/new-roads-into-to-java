public class EquationTester{
  //this is the class

   public static void main(String[] args){
     //main method
     
     Equation e = new Equation();
     //creates new equation
     
     e.addTerm('-', 2, 'x', 4);
     //adds terms from input
     
      System.out.println(e.toString());
     //prints out the equation 
     
     Derivative in = new Derivative();
     //creates the inverse
    
    in.setE(e);
     //sets equation to list of variables
    
    System.out.println(in.getE().toString());
     //prints out the equation order 
    System.out.println(in.getDerivative());
     //prints out the equation vadriables
   }
}

