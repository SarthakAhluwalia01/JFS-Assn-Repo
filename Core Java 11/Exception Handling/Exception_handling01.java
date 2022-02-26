package com.company;


import java.util.Scanner;

public class Exception_handling01 {

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Enter the Dividend number:");
            int dividend = scanner.nextInt();
            System.out.println("Enter the Divisor number:");
            int divisor = scanner.nextInt();
            int result = dividend/divisor;
            System.out.println("Result is:"+result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            if(scanner != null)
                scanner.close();
        }

    }

}