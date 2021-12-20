package com.treeMAP;

import java.util.*;

// tree map sort the keys in Ascending order
public class TreeMapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        map.put("ravi",9);
        map.put("suni",1);
        map.put("latha",2);
        map.put("mouli",5);
        map.put("anuradha",3);
        System.out.println(map);
        List<Map.Entry<String,Integer>> entries = new LinkedList<>(map.entrySet());
        entries.get(0);
        System.out.println(entries.get(0));
       for(Map.Entry<String,Integer> entry:entries){
           System.out.println("Key->"+entry.getKey()+":"+" Value->"+entry.getValue());
       }
    }
}
