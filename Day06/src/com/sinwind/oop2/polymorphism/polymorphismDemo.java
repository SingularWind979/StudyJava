package com.sinwind.oop2.polymorphism;

public class polymorphismDemo {
    public static void main(String[] args) {
        Animal a1 = new Fish();
        Animal a2 = new Cat();
        test(a1);
        test(a2);

    }

    public static void test(Animal a){
        if(a instanceof Fish f){
            f.swim();
        } else if (a instanceof Cat c) {
            c.catchMouse();
        }
    }
}
