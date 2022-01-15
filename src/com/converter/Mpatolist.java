package com.converter;

import java.util.*;

public class Mpatolist {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Ravi",1);
        map.put("nanda",2);
        map.put("teja",3);
        map.put("jack",4);  map.put("meh",5);
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        List<Map.Entry<String,Integer>> list = new ArrayList<>(set);
        list.forEach(System.out::println);
     TreeSet<String> treeSet = new TreeSet<>(map.keySet());
     treeSet.stream().forEach(i->System.out.println(i));
    }
}
    