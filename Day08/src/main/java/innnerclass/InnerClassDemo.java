package innnerclass;

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner1 inner1 = new Outer().new Inner1();
        Outer.Inner2 inner2 = new Outer.Inner2();
        inner1.method1();
        inner2.method2();
    }
}
