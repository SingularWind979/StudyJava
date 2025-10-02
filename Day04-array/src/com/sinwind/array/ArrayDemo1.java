package com.sinwind.array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        maxOf(arr);
    }

    public static void maxOf(int[] a){
        int maxNum = a[0];
        int maxIndex= 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] > maxNum){
                maxNum = a[i];
                maxIndex = i;
            }
        }

        System.out.println("最大值：" + maxNum + " 最大值索引：" + maxIndex);
    }
}





