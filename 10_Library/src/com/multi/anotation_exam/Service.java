package com.multi.anotation_exam;

// 사용자 입력값은 없고 아노테이션만 붙은 상태, default 값이 초괴화
//@AnotaionBasic(values = {"test","test2"})
@AnotaionBasic(number = 5, value = "test", values = {"1", "2", "3"})
public class Service {
    @AnotaionBasic
    @PrintAnnotation
    public void method1(){
        System.out.println("method1 실행");
    }
    public void method2(){
        System.out.println("method2 실행");
    }
    @PrintAnnotation(value = "#",number = 20)
    public void method(){
        System.out.println("method3 실행");
    }
}
