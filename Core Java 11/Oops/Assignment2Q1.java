package com.company;

class SingletonInheritanceCheck{
    private static  SingletonInheritanceCheck vInheritanceCheck = null;
    private SingletonInheritanceCheck(){} //constructor
    public static SingletonInheritanceCheck getSingleton()
    {
        if(vInheritanceCheck==null)
        {
            vInheritanceCheck = new SingletonInheritanceCheck();
        }
        return vInheritanceCheck;
    }

}


public class Assignment2Q1 {

    public static void main(String[] args) {

        SingletonInheritanceCheck singletonInheritanceCheck = SingletonInheritanceCheck.getSingleton();
        System.out.println(singletonInheritanceCheck);
        SingletonInheritanceCheck singletonInheritanceCheck1 = SingletonInheritanceCheck.getSingleton();
        System.out.println(singletonInheritanceCheck1);

    }

}
