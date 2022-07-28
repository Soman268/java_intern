// hierarchical inheritance

class A {
    public void c1()
     { 
        System.out.println("this is class A");
    }
}
  
class B extends A {
    public void c2() {
         System.out.println("this is class B");
         }
}
  
class C extends A {
    public void c3() {
         System.out.println("this is class C");
         }
}
  
class D extends A {
    public void c4() {
         System.out.println("This is class D");
         }
}


public class inheritance3 {
    
    public static void main(String args[])
    {
       // A obj = new A();
       // obj.c1();
      

        B obj1 = new B();
        obj1.c1();
        obj1.c2();
  
        C obj2 = new C();
        obj2.c1();
        obj2.c3();
  
        D obj3 = new D();
        obj3.c1();
        obj3.c4();
    }
}
