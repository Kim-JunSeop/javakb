package com.multi.ex01.array_basic;

public class ArrayBasic {
    public static void main(String[] args) {
        System.out.println("1. 배열 기본 생성");
        int[] array = null;
        array = new int[10];

        System.out.println(array[0]);
        System.out.println(array[1]);

        array[0] = 0;
        array[1] = 1;
        array[2] = 2;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i] + ",");
        }
    }
}
