package com.company;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface test{
    int value();
}


class Hello{
    @test(value=13)
    public void displayMethod()
    {

        System.out.println("Annotation_Test");
    }
}


public class AnnotationsQ1{
    public static void main(String[] args)throws Exception{

        Hello hi=new Hello();
        Method mo=hi.getClass().getMethod("displayMethod");

        test test1=mo.getAnnotation(test.class);
        System.out.println("value is: "+test1.value());
    }
}