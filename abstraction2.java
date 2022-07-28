//abstraction exampple 2:

abstract class A{
    public void hello(){
        System.out.println("hello");
    }
    public abstract void how();
    public abstract void are();
  public  abstract void you();
}

  abstract class B extends A{
    public void how(){
        System.out.println("how");
    }
}
   abstract class C extends A{
        public void are(){
            System.out.println("are");
        }
    
    };
    class D extends A{   //concrete class
    
       public void you(){
            System.out.println("you");
        }
        public void are(){
            System.out.println("are");
        }
        public void how(){
            System.out.println("how");
        }
    }


public class abstraction2 {
    public static void main(String args[]){
        A obj = new D();
        obj.hello();
        obj.how();
        obj.are();
        obj.you();

    }
    
}
