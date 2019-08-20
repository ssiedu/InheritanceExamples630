
public class B extends A {

    public void f3() {
        System.out.println("Hello From F3");
    }
    public void f4() {
        System.out.println("Hello From F4");
    }
    public void test() {
        f1();
        f2();
        f3();
        f4();
    }
    public static void main(String args[]) {
        B ob=new B();
        ob.test();
    }
}
