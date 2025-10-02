package com.sinwind.oop2.polymorphism;

public class Cat extends Animal{
    public Cat() {
        super();
    }
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    public void catchMouse() {
        System.out.println("Cat is catching mouse");
    }
}
