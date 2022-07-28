// simple example of polymorphism


class bike{
    void run(){
        System.out.println("its runs fast");
    }
}

class bmw extends bike{
    void run(){
        System.out.println("it is the best");
    }
}


public class polymorphism {
    
    public static void main(String args[]){
        bike b;
        b= new bike();
        b.run();

         b = new bmw();
        b.run();
        
    }
}
