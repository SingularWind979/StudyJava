package com.sinwind.branch;

public class AutoPassLight {
    public static void main(String[] args) {
        boolean redLight = true;
        boolean yellowLight = false;
        boolean greenLight = false;

        if (redLight) {
            System.out.println("红灯亮，停止");
        } else if (yellowLight) {
            System.out.println("黄灯亮，准备");
        } else if (greenLight) {
            System.out.println("绿灯亮，通行");
        } else {
            System.out.println("灯泡故障，停止");
        }
    }
}
