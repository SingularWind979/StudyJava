public class SingleInstanceDemo {
    public static void main(String args[]){
        A a = new A();
        System.out.println(a.getInstance());
        B b = new B();
        System.out.println(b.getInstance());
    }
}

class A{
    private static A instance = new A();

    public static A getInstance() {
        return instance;
    }
}

class B{
    private static B instance = null;

    public static B getInstance() {
        if(instance == null){
            instance = new B();
        }
        return instance;
    }
}

enum C{
    INSTANCE;
}