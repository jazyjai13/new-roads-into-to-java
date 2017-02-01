public class Derivative{

  private Derivative e = new Derivative();
  
  public Derivative(){
    
  }
  
  public Derivative getDerivative(){
    return e;
  }
  
     public void setE(Derivative newE){
    e = newE;
  }
  
  public String getDerivative(){
    Term term = e.getTerm(0);
    
    return "x=" + term.getCoefficient() + "y^" + term.getPpower();
   }
 }
