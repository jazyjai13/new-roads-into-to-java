public class EquationTester{

   public static void main(String[] args){
     
     Equation e = new Equation();
     
     e.setOperator('+');
     e.setVariable1('x');
     e.setVariable2('y');
     e.setEquals('=');
     e.setNumber(2);
     
      System.out.println(e.toString());
   }
}