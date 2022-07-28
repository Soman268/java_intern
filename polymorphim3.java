// overriding
class animal{
    void type(){
        System.out.println("It is a dog");
    }
}
class dog extends animal{
    void type(){
        System.out.println("it is a domestic animal");
    }
}

public class polymorphim3 {
    public static void main(String[] args) {
        
    
    animal d;
    d=new dog();
    d.type();

    d=new animal();
    d.type();
    }
    
}
