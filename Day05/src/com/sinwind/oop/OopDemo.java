package com.sinwind.oop;

public class OopDemo {
    public static void main(String[] args) {
        OopDemo.starTest();
        OopDemo.studentTest();
    }

    public static void starTest(){
        Star s1 = new Star();
        s1.inputInfo();
        s1.printInfo();
        Star s2 = new Star( "小王", "男", 18, 1.80, 80);
        s2.printInfo();
    }

    public static void studentTest(){
        Student stu1 = new Student("小王", "男", 18, 80, 90, 80, 80, 80);
        Student stu2 = new Student();

        StudentOperator so1 = new StudentOperator(stu1);
        so1.calcScore();
        so1.printScore();
        StudentOperator so2 = new StudentOperator(stu2);
        so2.inputScore();
        so2.calcScore();
        so2.printScore();
        System.out.println("----------");
    }
}
