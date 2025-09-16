package com.sinwind.hello;

public class HelloWorld {
    public static void main(String[] args) {
        printNum(1,10);
        printNum(1);
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