import java.util.Scanner;

public class TestLoops{

public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.println("Give me a whole number");
  	
  	int num = input.nextInt();
  
  System.out.println("Without the loop");
  System.out.println("0");
  System.out.println("1");
  System.out.println("2");
  System.out.println("3");
  System.out.println("4");
  System.out.println("5");
  
  
  System.out.println("\n With the loop");
  //the for loop
  
  for(int i = 0; i <=5; i=i+1){
    
   // for(int j = 0; j <= ; j++);
   
    if(i % 2 == 0){
     System.out.println(i);
  }
  
  }
}
  

}