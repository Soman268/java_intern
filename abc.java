public class abc {
    void disp(){
        System.out.println("hello");
        System.out.println("how are you?");
    }

    public static void main(String args[]){
    System.out.println("welcome");

    abc obj = new abc();
    obj.disp();

    abc obj2 = new abc();
    obj2.disp();

    System.out.println("end");
    }
}
