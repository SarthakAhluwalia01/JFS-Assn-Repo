package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class lambda08 {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(21,32,44,56,77,86,97,98,99,100,110,215);

        Consumer<List<Integer> > dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

        Thread t = new Thread(()->dispList.accept(list1));
        t.start();
    }
}
