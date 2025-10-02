package com.sinwind.oop2.inheritance;

public class inheritanceDemo {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o);
        Teacher t = new Teacher("张三", 20, '男', "C++");
        System.out.println(t);
        People people = new People("李四", 18, '女');
        System.out.println(people);
    }
}
