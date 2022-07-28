// multilevel inheritance

class animal{
    void type(){
        System.out.println("domestic or wild");
    }
}

class domestic extends animal{
    void dog(){
        System.out.println("dog is a domestic animal");

    }
}

class wild extends domestic{
    void tiger(){
        System.out.println("tiger is a wild animal");
    }
}


public class inheritance2 {
    public static void main(String args[]){
        wild t = new wild();
        t.tiger();
        t.dog();
        t.type();
    }
    
}
