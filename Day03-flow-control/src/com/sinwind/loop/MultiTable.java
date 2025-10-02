package com.sinwind.loop;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        int size = getSize();
        printMultiTable(size);
    }

    public static int getSize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入打印的表格大小：");
        return sc.nextInt();
    }

    public static void printMultiTable(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }
}
