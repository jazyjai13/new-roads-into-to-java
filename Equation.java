import java.util.ArrayList;
//imports an array list

public class Equation{
  //makes it a class

  private ArrayList<Term> list = new ArrayList<Term>();
  //this creates a ay to make an array list
  
  public Equation(){
    //this is the class
    
  }
  
  public void addTerm(char opperator, int coefficient, char variable, int power){
    //this adds the terms opperator, coefficient, variable and power
    list.add(new Term(opperator, coefficient, variable, power));
    //adds new terms for the equation
  }
  
  public void addTerm(Term term){
    //adds the terms together
    list.add(term);
    //adds terms in a list
  }
  
  public Term getTerm(int index){
    //this is how you get the index
    return list.get(index);
    //returns index
  }
  
  public String toString(){
    //this goes to what we finally print out
   
    String equation = "y=";
    // this is how the equation will start when printed
    
    for(int i = 0; i < list.size(); i++){
      //adds number of terms that user inputed
      equation =  equation + list.get(i);  
      //puts the terms in the equation
    }
    
    return equation;
    //returns equation
  }
}




