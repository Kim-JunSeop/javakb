package com.multi.anotation_exam;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface AnotaionBasic {// Anotaion이란?

    String value() default "-";
    String[] values() default {"-","-"};
    int number() default  0;
}
