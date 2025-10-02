package com.sinwind.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        scanner();
    }

    public static void scanner() {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入字符串：");
        String str = sc.next();
        System.out.println("输入的字符串是：" + str);

        System.out.println("请输入字符：");
        char ch = sc.next().charAt(0);
        System.out.println("输入的字符是：" + ch);

        System.out.println("请输入数字：");
        int num = sc.nextInt();
        System.out.println("输入的数字是：" + num);

        System.out.println("请输入浮点数：");
        double db = sc.nextDouble();
        System.out.println("输入的浮点数是：" + db);

        System.out.println("请输入布尔值：");
        boolean bool = sc.nextBoolean();
        System.out.println("输入的布尔值是：" + bool);
    }
}
