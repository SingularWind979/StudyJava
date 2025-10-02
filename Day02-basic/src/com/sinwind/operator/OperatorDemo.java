package com.sinwind.operator;

public class OperatorDemo {
    public static void main(String[] args) {
        System.out.println(maxOf(1, 2, 3));
    }

    public static int maxOf(int a,int b){
        return a>b?a:b;
    }

    public static int maxOf(int a,int b, int c){
        return maxOf(maxOf(a,b),c);
    }
}
