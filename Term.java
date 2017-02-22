public class Term{

private char opperator;
private int coefficient;
private char variable;
private int power;


public Term(){
  
}

public Term(char newOpperator, int newCoefficient, char newVariable, int newPower){
opperator = newOpperator;
coefficient = newCoefficient;
variable = newVariable;
power = newPower;
}
  
  public char getOpperator(){
    return opperator;
  }
  
  public void setOpperator(char newOpperator){
    opperator = newOpperator;
  }
  
  public int getCoefficient(){
    return coefficient;
  }
  
  public void setCoefficient(int newCoefficient){
    coefficient = newCoefficient;
  }
  
  public char getVariable(){
    return variable;
  }
  
  public void setVariable(char newVariable){
    variable = newVariable;
  }
  
   public int getPower(){
    return power;
  }
  
  public void setPower(int newPower){
    power = newPower;
  }
  
   
  public String toString(){
    return opperator + coefficient + "" + variable + "^" + power + " ";
  }
  
}




