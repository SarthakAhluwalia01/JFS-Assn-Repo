package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



class Transaction {
    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}
public class StreamsQ4 {
    public static List<Transaction> sortTransactions(List <Transaction> transactions) {
        List<Transaction> sortedTrans= new ArrayList<>();
        sortedTrans=transactions.stream()
                .filter(p->p.getYear()==2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toCollection(ArrayList::new));
        return  sortedTrans;
    }

    public static List<Integer> transaction3sValuesDelhi(List<Transaction> transactions) {
        List<Integer> transactioValueDelhi = new ArrayList<>();
        transactions.stream()
                .filter(p->p.getTrader().getCity().equals("Delhi"))
                .forEach(p->transactioValueDelhi.add(p.getValue()));
        System.out.println(transactioValueDelhi);
        return transactioValueDelhi;
    }
    public static int highestTransaction2(List<Transaction> transactions){
        int mx=Integer.MIN_VALUE;
        List<Integer>list = new ArrayList<>();
        transactions.stream()
                .forEach(p->list.add(p.getValue()));
        mx =Collections.max(list);
        return  mx;
    }

    public static int smallestTransaction1(List<Transaction> transactions){
        int mn=Integer.MAX_VALUE;
        List<Integer>list = new ArrayList<>();
        transactions.stream()
                .forEach(p->list.add(p.getValue()));
        mn =Collections.min(list);
        return  mn;

    }

    public static void main(String[] args) {
        Trader t1 = new Trader("Sarthak ", "Gwalior");
        Trader t2 = new Trader("Shruti ", "Jabalpur");
        Trader t3 = new Trader("Akanksha ", "Bhopal");
        Trader t4 = new Trader("Tanushri ", "Delhi");
        Trader t5= new Trader("Harsh ", "Indore");

        Trader t6 = new Trader("Pralanj ", "Gwalior");
        Trader t7 = new Trader("Vivek ", "Bhopal");
        Trader t8 = new Trader("Martin ", "Bhopal");

        Transaction ts1 = new Transaction(t1,2014,600);
        Transaction ts2 = new Transaction(t2,2012,400);
        Transaction ts3 = new Transaction(t3,2015,500);
        Transaction ts4 = new Transaction(t4,2011,850);
        Transaction ts5 = new Transaction(t5,2016,700);
        Transaction ts6 = new Transaction(t6,2011,200);
        Transaction ts7 = new Transaction(t7,2011,100);
        Transaction ts8 = new Transaction(t8,2012,300);

        ArrayList<Transaction> transactions = new ArrayList<>();
        transactions.add(ts1);
        transactions.add(ts2);
        transactions.add(ts3);
        transactions.add(ts4);
        transactions.add(ts5);
        transactions.add(ts6);
        transactions.add(ts7);
        transactions.add(ts8);
        sortTransactions(transactions);
        transaction3sValuesDelhi(transactions);
        System.out.println(highestTransaction2(transactions));


    }
}
