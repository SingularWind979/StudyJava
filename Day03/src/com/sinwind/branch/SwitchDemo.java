package com.sinwind.branch;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sex = sc.next().charAt(0);

        //传统方法
        switch(sex){
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid sex");
        }

        //箭头方法
        switch(sex){
            case 'M' -> System.out.println("Male");
            case 'F' -> System.out.println("Female");
            default  -> System.out.println("Invalid sex");
        }
    }
}
