//this class is to test the card object
public class CardTester{
  
  //main method for testing
  public static void main(String[] args){
    
    //main method for testing
    Card c = new Card(); 
    
    c.setColor("black");
    c.setSuit("spades");
    c.setRank('T');
    
    //this is first card in string
    System.out.println(c.toString());

  
  //second card in string
  Card c2 = new Card();
    
   c2.setColor("black");
   c2.setSuit("spades");
   c2.setRank('J');
  
  System.out.println(c2.toString());
  
  
  Card c3 = new Card();
  
   c3.setColor("black");
   c3.setSuit("spades");
   c3.setRank('Q');
  
  System.out.println(c3.toString());
  
  
  
  Card c4 = new Card();
  
   c4.setColor("black");
   c4.setSuit("spades");
   c4.setRank('K');
 
  System.out.println(c4.toString());
  
    
    
  Card c5 = new Card();
  
   c5.setColor("black");
   c5.setSuit("spades");
   c5.setRank('A');
 
  System.out.println(c5.toString());
  
  }
  
}//end of class