package com.company;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;



public class lambda05 {
    List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static void main(String[] args) {
        lambda05 lambdaQ5 = new lambda05();
        processWords(lambdaQ5.list);
    }

    public static String processWords(List<String> list) {
        StringBuilder words = new StringBuilder();
        Consumer<String> consumer = p-> words.append(p.charAt(0));

        list.stream().forEach(consumer);
        System.out.println(words);
        return  words.toString();
    }
}
