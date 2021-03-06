package com.company;


import java.util.Scanner;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){

        double si = (principalAmount*time*interestRate)/100;

        return  si;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){

        double ci = (principalAmount * (Math.pow((1+interestRate),time)) ) - principalAmount;

        return ci;
    }
}


public class Assignment1Q3 {

    public static void main(String[] args) {

        SiCi siCi = new SiCi();
        double principalAmounnt,interestRate;
        int time;
        System.out.println("Please enter the principal Amount: ");
        try (var sc = new Scanner(System.in)) {
            principalAmounnt = sc.nextDouble();
            System.out.println("Please enter the Annual interest rate: ");
            interestRate = sc.nextDouble();
            System.out.println("Please enter the period of time: ");
            time = sc.nextInt();
        }
        System.out.println("Simple interest for the principal Amount "+principalAmounnt+" for "+time+" years: "+siCi.simpleInterest(principalAmounnt,time,interestRate));

        System.out.println("Compound interest for the principal Amount "+principalAmounnt+" for "+time+" years: "+siCi.compoundInterest(principalAmounnt,time,interestRate));

    }

}