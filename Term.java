public class Term{

private int coefficient;
private char variable;
private int power;


public Term(){
  
}

public Term(int newCoefficient, char newVariable, int newPower){

coefficient = newCoefficient;
variable = newVariable;
power = newPower;
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
    return coefficient + "" + variable + "^" + power + " ";
  }
  
}




