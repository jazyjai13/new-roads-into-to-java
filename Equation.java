public class Equation{

  private char operator;
  private char variable1;
  private char variable2;
  private char equals;
  private int number;
  
  public Equation(){

  }
  
  public Equation(char newOperator, char newVariable1, char newVariable2, char newEquals, int newNumber){
    operator = newOperator;
    variable1 = newVariable1;
    variable2 = newVariable2;
    equals = newEquals;
    number = newNumber;
  }
  
  public char getOperator(){
    return operator;
  }
  
  public void setOperator(char newOperator){
    operator = newOperator;
  }
  
  public char getVariable1(){
    return variable1;
  }
  
  public void setVariable1(char newVariable1){
    variable1 = newVariable1;
  }
  
  public char getVariable2(){
    return variable2;
  }
  
  public void setVariable2(char newVariable2){
    variable2 = newVariable2;
  }
  
  public char getEquals(){
    return equals;
  }
  
  public void setEquals(char newEquals){
    equals = newEquals;
  }
  
  public int getNumber(){
    return number;
  }
  
  public void setNumber(int newNumber){
    number = newNumber;
  }
  
  public String toString(){
    return operator + " " + variable1 + " " + variable2 + " " + equals + " ";
  }
}