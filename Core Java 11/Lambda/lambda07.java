package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;


public class lambda07 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("p",536);
        map.put("q",239);
        map.put("r",175);

        lambda07 Lambda07 = new lambda07();
        Lambda07.convertKeyValueToString(map);

    }
    public String convertKeyValueToString(HashMap<String, Integer> map) {

        StringBuilder str = new StringBuilder();
        Consumer<Map.Entry> consumer=(p)->str.append(p.getKey()).append(p.getValue());
        Set set  = map.entrySet();
        set.stream()
                .forEach(consumer);



        System.out.println(str);
        return str.toString();


    }
}