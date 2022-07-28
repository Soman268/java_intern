//overloading
class sum{

    static int add(int a ,int b){
        return a+b;
    }

    static int add(int a,int b,int c){
        return a+b+c;
    }
}
public class polymorphism2 {
    public static void main(String args[])
    {
        //polymorphism2 obj = new polymorphism2();
        System.out.println(sum.add(4,6));
        System.out.println(sum.add(4,6,12));
    }
    
}
