package com.sinwind.hello;

public class HelloWorld {
    public static void main(String[] args) {
        printNum(1,10);
        printNum(1);
        double x=3.5;
        int y=13;
        double z=2.5;
        System.out.println(x+y%4*(int)(x+y)%3/2);
    }
    public static void printNum(int c){
        if(c>0){
            return;
        }
        System.out.println("c:"+c);
    }
    public  static void printNum(int a,int b){
        if(a>b){
            return;
        }
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }

}