package com.converter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListtoMap {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);

        list.forEach(System.out::println);
       Map<Integer,Integer> map = list.stream().collect(Collectors.toMap(i->i, ( i)->i));
       Map<Integer,Integer> map1 = list.stream().collect(Collectors.toMap(j->j,j->j));
       System.out.println(map);
       for(Map.Entry<Integer,Integer> entries: map1.entrySet()){
           System.out.println("Key: "+entries.getKey()+" "+ "Value: "+entries.getValue());
       }

    }
}
//KeyNotes: to convert list to map we can use. collect(Collectors.to map(Integer::new , i->i))<-give the datatype
//of the list inside the map and iterate with i