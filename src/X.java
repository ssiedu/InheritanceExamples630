public abstract class X {
    //concrete methods
    void f1(){
        System.out.println("hello");
    }
    void f2(){
        System.out.println("welcome");
    }
    //abstract methods
    abstract void f3();
    abstract void f4();
    static void display(){
        System.out.println("hello from a method of X");
    }
}
