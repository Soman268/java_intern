//simple abstraction example


abstract class Bike{  
    abstract void run();  
  }  
  class Honda extends Bike{  
  void run(){
    System.out.println("best");
   }  
 
  }  


public class abstraction {
    
    public static void main(String args[]){  
        Bike obj = new Honda();  
        obj.run();  
       }  
}
