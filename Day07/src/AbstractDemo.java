public class AbstractDemo {
    public static void main(String[] args){
        test1();
    }

    public static void test1() {
        testWork(new Man());
        testWork(new Boy());
    }

    public static void testWork(People people){
        people.work();
    }
}

abstract class People{
    private String name;
    private int age;
    private String sex;

    public abstract void work();
    public abstract void eat();
    public abstract void sleep();
}

class Man extends People{
    @Override
    public void work() {
        System.out.println("Man works");
    }
    @Override
    public void eat() {
        System.out.println("Man eats");
    }
    @Override
    public void sleep() {
        System.out.println("Man sleeps");
    }
}

class Boy extends Man{
    @Override
    public void work() {
        System.out.println("Boy works");
    }
    @Override
    public void eat() {
        System.out.println("Boy eats");
    }
    @Override
    public void sleep() {
        System.out.println("Boy sleeps");
    }
    public void play() {
        System.out.println("Boy plays");
    }
}