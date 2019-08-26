
public class B extends A {

    int data = 500;

    
    B() {
        
        super(10);
        System.out.println("B-0");
    }

    B(int p) {
        super(1,2);
        System.out.println("B-1");
    }

    B(int p, int q) {
        super(5);
        System.out.println("B-2");
    }

    public void show() {
        System.out.println("Welcome From Show of B");
    }

    public void display() {
        super.show();
        //System.out.println(super.data);
    }

    public static void main(String args[]) {
        
        B ob = new B(10,20);
        
        
        //ob.display();
    }
}
