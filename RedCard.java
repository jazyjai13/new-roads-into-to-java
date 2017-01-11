public class RedCard extends Card{

  private String color;
  
  //default constructor
  public RedCard(){
    /*suit = suit;
    rank = rank;*/
    color = "red";
  }
  
  public String toString(){
    return super.toString() + " " + color;
  }
}