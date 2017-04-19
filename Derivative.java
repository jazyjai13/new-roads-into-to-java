public class Derivative{
  //this is the class, how you must start every project

  private Equation e = new Equation();
  //this is the format to create an equation
  
  public Derivative(){
    //this is the class
    
  }
  
  public Equation getEquation(){
    //this is the format so that input can be presented a an equation
    return e;
    // returns the equation
  }
  
  public Equation getE(){
    // this is to get equation e
    return e;
    //returns equation
  }
  
     public void setE(Equation newE){
       //sets equation as a new equaion E
    e = newE;
       //equation equals new equation
  }
  
  public String getDerivative(){
    //this is to put the equation in the order we want
    Term term = e.getTerm(0);
    //this reads the term in the 0 spot first
    
    return "x=" + term.getCoefficient() + "y^" + term.getPower();
    //this is how it knows what to print out
   }
 }
