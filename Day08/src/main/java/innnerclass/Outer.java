package innnerclass;

public class Outer {
    public class Inner1 {
        public void method1(){
            System.out.println("Inner1.method1");
        }
    }

    public static class Inner2{
        public void method2(){
            System.out.println("Inner2.method2");
        }
    }
}
