package com.sinwind.oop;

import java.util.Scanner;

public class Star {
    public static int count;
    private String name;
    private String sex;
    private int age;
    private double height;
    private double weight;

    public Star(){
        Star.count++;
    }

    public Star(String name, String sex, int age, double height, double weight){
        Star.count++;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void inputInfo(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入姓名：");
        name = sc2.next();
        System.out.println("请输入性别：");
        sex = sc2.next();
        System.out.println("请输入年龄：");
        age = sc2.nextInt();
        System.out.println("请输入身高：");
        height = sc2.nextDouble();
        System.out.println("请输入体重：");
        weight = sc2.nextDouble();
        sc2.close();
    }
    public void printInfo(){
        System.out.println("姓名：" + name);
        System.out.println("性别：" + sex);
        System.out.println("年龄：" + age);
        System.out.println("身高：" + height);
        System.out.println("体重：" + weight);
    }
}
