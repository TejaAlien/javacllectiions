package com.sortverizon;

import java.util.*;

public class Mian {
    public static void main(String[] args) {
        Map<Integer,Person> map = new HashMap<>();
        map.put(3,new Person("Ravi","Nanda","vja"));
        map.put(1,new Person("Amma","Battula","Bushanagulla"));
        map.put(2,new Person("Suni","Nanda","vja"));
        map.put(4,new Person("Siva","Nanda","vja"));
 TreeMap<Integer,Person> treeMap = new TreeMap<>(map);
 System.out.println("Sorting based on key by using treemap");
for(Map.Entry<Integer, Person> keyvalue:treeMap.entrySet()){
    System.out.println(keyvalue.getKey()+" "+keyvalue.getValue());
}
System.out.println("Sorting based on firstname+" +
        "by converting hashmap into set " +
        "and converting set to arraylist" +
        "so that we can use collections.sort" +
        "and using comparator interface override the compare method" +
        "and sorting by firstname:");
     Set<Map.Entry<Integer,Person>> set = map.entrySet();
    /* for(Map.Entry<Integer,Person> f:set){
         System.out.println(f.getKey()+" "+f.getValue());
     }*/
     List<Map.Entry<Integer,Person>> ls = new ArrayList<>(set);//<--converting set to list so we can use sort method
     Collections.sort(ls,new Comparator<Map.Entry<Integer,Person>>(){

         @Override
         public int compare(Map.Entry<Integer, Person> o1, Map.Entry<Integer, Person> o2) {
             int comparision;
             comparision = o1.getValue().getFirtname().compareTo(o2.getValue().getFirtname());
             return comparision;
         }
     });
        for(Map.Entry<Integer,Person> entries:ls){//<--- tree map sorting by keys
            //ls object has key and values
            System.out.println(entries.getKey()+" "+entries.getValue());
 }
    }

}
//KeyNotes:
//map.entryset is used to convert the map into a set ,so set has key and value