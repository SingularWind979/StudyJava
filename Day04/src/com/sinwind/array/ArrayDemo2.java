package com.sinwind.array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[][] array= {{1,2,3},{4,5,6},{7,8}};

        printArray1(array);
        printArray2(array);
    }

    public static void printArray1(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("\t" + array[i][j]);
            }
            System.out.println();
        }
        System.out.println("=================");
    }

    public static void printArray2(int[][] array){
        for (int[] nums : array) {
            for (int num : nums) {
                System.out.print("\t" + num);
            }
            System.out.println();
        }
        System.out.println("=================");
    }
}
