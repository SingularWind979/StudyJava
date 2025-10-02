package com.sinwind.loop;

public class ForDemo {
    public static void main(String[] args) {
        System.out.println("1到5的和是：" + sumUp(1, 5));
        System.out.println("1到5的和是：" + sumUpOdd(1, 5));
    }

    public static int sumUp(int left, int right){
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumUpOdd(int left, int right){
        int sum = 0;
        for (int i = left; i <= right; i += 2) {
            if (i % 2 != 0){
                sum += i;
            }
        }
        return sum;
    }
}
