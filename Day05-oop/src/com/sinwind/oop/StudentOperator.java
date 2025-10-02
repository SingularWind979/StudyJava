package com.sinwind.oop;

import java.util.Scanner;

public class StudentOperator {
    private Student stu;

    public StudentOperator(Student stu) {
        this.stu = stu;
    }

    public void inputScore(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        stu.setName(sc.next());
        System.out.println("请输入性别：");
        stu.setSex(sc.next());
        System.out.println("请输入年龄：");
        stu.setAge(sc.nextInt());
        System.out.println("请输入数学成绩：");
        stu.setMathScore(sc.nextDouble());
        System.out.println("请输入语文成绩：");
        stu.setChineseScore(sc.nextDouble());
        System.out.println("请输入英语成绩：");
        stu.setEnglishScore(sc.nextDouble());
        sc.close();
    }

    public void calcScore(){
        stu.setSum(stu.getChineseScore()+stu.getMathScore()+stu.getEnglishScore());
        stu.setAvg(stu.getSum() / 3.0);
    }

    public void printScore(){
        System.out.println("姓名：" + stu.getName());
        System.out.println("性别：" + stu.getSex());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("数学成绩：" + stu.getMathScore());
        System.out.println("语文成绩：" + stu.getChineseScore());
        System.out.println("英语成绩：" + stu.getEnglishScore());
        System.out.println("总分：" + stu.getSum());
        System.out.println("均分：" + stu.getAvg());
    }
}