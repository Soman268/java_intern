// single inheritance

class animals{
    void type(){
        System.out.println("domestic or wild");
    }
}
class domestic extends animals{
    void dog(){
        System.out.println("dog is a domestic animal");
    }
}
class wild extends animals{
    void tiger(){
        System.out.println("tiger is a wild animal");
    }
}

public class inheritance {
    
    public static void main(String args[]){
        wild to = new wild();
        to.tiger();
       // to.dog(); { error as multiple inheritance not supported in java }
        to.type();

    }
}
