package com.company;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Trader {
    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

public class StreamsQ3 {
    public static List<String> printUniqueCities (List<Trader> traders) {
        Set<String> list = new TreeSet<>();
        List <Trader> uniqueList = new ArrayList<>();
        uniqueList= traders.stream()
                .filter(p-> list.add(p.getCity()))
                .distinct().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(uniqueList);
        System.out.println("_________");
        List<String> list1 = new ArrayList<>();
        for(Trader trader:uniqueList){
            list1.add(trader.getCity());
        }
        return list1;
    }

    public static List<String> trader2sFromPuneSortByName(List<Trader> traders) {
        List<String> uniqueList = new ArrayList<>();
        traders.stream()
                .filter(p-> p.getCity().equals("Pune"))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList())
                .forEach(p->uniqueList.add(p.getName()));
        System.out.println(uniqueList);
        return  uniqueList;
    }
    public static String allTrader3Names(List<Trader> traders) {
        String  allTrader="";
        ArrayList<Trader> arrayList = new ArrayList<>();
        arrayList=traders.stream()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toCollection(ArrayList::new));

        for(Trader trader:arrayList){
            allTrader+=trader.getName();
        }
        return allTrader;
    }
    public static ArrayList<Trader> areAnyTrader4sFromIndore(ArrayList<Trader> traders) {
        ArrayList<Trader>traders1 = traders;
        ArrayList<Trader> traders2 = new ArrayList<>();
        traders2=traders1.stream()
                .filter(p->p.getCity().equals("Indore"))
                .collect(Collectors.toCollection(ArrayList::new));
        return  traders2;
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


        List<Trader> traders = new ArrayList<>();
        traders.add(t1);
        traders.add(t2);
        traders.add(t3);
        traders.add(t4);
        traders.add(t5);
        traders.add(t6);
        traders.add(t7);
        traders.add(t8);

        ArrayList<Trader> traders1 = new ArrayList<>();
        traders1.add(t1);
        traders1.add(t2);
        traders1.add(t3);
        traders1.add(t4);
        traders1.add(t5);
        traders1.add(t6);
        traders1.add(t7);
        traders1.add(t8);
        printUniqueCities(traders);
        trader2sFromPuneSortByName(traders);
        System.out.println(allTrader3Names(traders));
        System.out.println(areAnyTrader4sFromIndore(traders1));
    }
}
