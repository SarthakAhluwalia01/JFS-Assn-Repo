package com.company;


import java.util.HashMap;
public class Generics02 {
    public static void main(String[] args) {
        {
            HashMap<Integer,Double> hmap = new HashMap<Integer,Double>();
            hmap.put(11,1.17);
            hmap.put(22,2.29);
            hmap.put(33,3.333);
            hmap.put(44,4.48);
            hmap.put(55,5.56);
            hmap.put(66,6.67);
            hmap.put(77,7.75);
            hmap.put(88,8.82);
            hmap.put(99,9.9);
            hmap.put(1000,10.111);
            System.out.println(hmap);
        }
    }
}
