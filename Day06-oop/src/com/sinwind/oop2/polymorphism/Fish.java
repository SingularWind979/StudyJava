package com.sinwind.oop2.polymorphism;

public class Fish extends Animal{
    public Fish() {
        super();
    }
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    public void swim(){
        System.out.println("Fish is swimming");
    }
}
