package com.multi.ex01.generic;

public class MyGenericArray <T>{
    // 제네릭이란? Type을 사용자가 외부에서 주입(injection) 시켜 정의하는 문법
    // T는 Type의 약자로 활용, <T>로 외부에서 타입을 주입시켜 내부에 Type으로 대체된다.
    // T는 정해져 있지 않은 상태에서 미리 프로그래밍이 가능하고, 'T'로 안해도 되고 사용자가 정해도 된다.

    private Object[] array;
    private int index = 0;

    public MyGenericArray(int size){
        array = new Object[size];
    }
    public int add (T item){
        if (index>= array.length){
            return -1;
        }
        array[index++] = item;
        return index;
    }
    public T get(int index){
        if (index < 0 || index >= array.length){
            return null;
        }
        return (T) array[index];
    }
}
