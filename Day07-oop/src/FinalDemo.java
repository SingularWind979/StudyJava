public class FinalDemo {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        final int a = 10;
        final int b = 20;
//      b = 30;
    }

    private static void test2() {
        A a1 = new A();
        a1.show();
        A a2 = new B();
        a2.show();
    }

    public static class A{
        public void show(){
            System.out.println("show A");
        }
    }
    public static final class B extends A{
        @Override
        public void show() {
            System.out.println("show B");
        }
    }
//    public class C extends B{}

}
