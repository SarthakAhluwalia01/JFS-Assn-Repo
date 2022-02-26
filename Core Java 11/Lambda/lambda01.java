package com.company;



@FunctionalInterface

interface Arithmetic {
    double operation(double a, double b);
}

public class lambda01{
    public static void main(String[] args) {


        Arithmetic addition = (double a, double b) -> (a + b);


        System.out.println("Addition = " + addition.operation(13, 5));


        Arithmetic subtraction = (double a, double b) -> (a - b);


        System.out.println("Subtraction = " + subtraction.operation(13, 5));


        Arithmetic multiplication = (double a, double b) -> (a * b);


        System.out.println("Multiplication = " + multiplication.operation(13, 5));


        Arithmetic division = (double a, double b) -> (a / b);


        System.out.println("Division = " + division.operation(13, 5));

    }
}
