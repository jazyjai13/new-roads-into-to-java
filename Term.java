public class Term{
  //this makes Term a class

private char opperator;
  //this is so that we can insert opperators in numbers or letters or symbols 
private int coefficient;
  //this is so we caninsert integer coefficient before variables
private char variable;
  //this is so that we can insert variables to be put after the coefficient 
private int power;
  //this is so that we can put a power after a variable


public Term(){
  //this is the class
  
}

public Term(char newOpperator, int newCoefficient, char newVariable, int newPower){
  //this is so that the program accepts new information and can work on it
opperator = newOpperator;
  //set opperator to a new opperator
coefficient = newCoefficient;
  //sets coefficient to a new coefficient
variable = newVariable;
  // sets variable to a new variable
power = newPower;
  //sets power to a new power
}
  
  public char getOpperator(){
    //makes it so that nput can be recieved for opperator in numbers, letters, or symbols
    return opperator;
    //returns opperator
  }
  
  public void setOpperator(char newOpperator){
    //sets the opperator as a new opperator
    opperator = newOpperator;
    //creates a new opperator from the opperator
  }
  
  public int getCoefficient(){
    //creates a way for coefficient to be inputed
    return coefficient;
    //returns coefficient
  }
  
  public void setCoefficient(int newCoefficient){
    //sets the coefficient as a new coefficient
    coefficient = newCoefficient;
    //creates a new coefficient from the coefficient
  }
  
  public char getVariable(){
    //creates a way for a variable to be inputed
    return variable;
    //returns variable
  }
  
  public void setVariable(char newVariable){
    //sets the variable as a new variable
    variable = newVariable;
    //creates a new variable from the variable
  }
  
   public int getPower(){
     //power input
    return power;
     //returns power
  }
  
  public void setPower(int newPower){
    //sets power to new power
    power = newPower;
    //creates new power from the power
  }
  
   
  public String toString(){
    //inserts equation variables into an order
    return coefficient + "" + variable + "^" + power + " " + opperator;
    //returns input in this order
  }
  
}




