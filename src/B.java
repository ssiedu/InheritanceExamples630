
public class B extends A {

    public void f1(){
        System.out.println("Hello From F1 of B");
    }
    
    public void f2() {
        System.out.println("Hello From F2 of B");
    }
   
    public static void main(String args[]) {
        B ob=new B();
        ob.f1();
        ob.f2();
        
    }
}
