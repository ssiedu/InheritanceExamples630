package p2;

import p1.Main;

public class NonChildOutsidePkg {
    void test(){
        Main ob=new Main();
        System.out.println(ob.a);
        System.out.println(ob.b);
        System.out.println(ob.c);
        System.out.println(ob.d);
    }
}
