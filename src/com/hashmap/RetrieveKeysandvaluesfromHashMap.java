package com.hashmap;

import java.util.*;

public class RetrieveKeysandvaluesfromHashMap {
    public static void main(String[] args) {
        Map<String,Integer> numberMapping = new HashMap<>();
        numberMapping.put("one",1);
        numberMapping.put("two",2);
        numberMapping.put("three",3);
        numberMapping.put("four",4);
        numberMapping.put("five",5);
        numberMapping.put("six",6);
        numberMapping.put(null,8);
        //Keyset() method is used to get the set of Keys
        System.out.println("Retrieve only Keys:->");
        Set<String> Keys = numberMapping.keySet();
        for(String key :Keys){
            System.out.println(" "+key);
        }
        // If you want to retreive only values
        System.out.println("Retrieve only values:->");
 Collection<Integer> values = numberMapping.values();
        for(Integer value: values){
            System.out.print(" "+ value);
        }
        //different ways to iterate over hashmap
        //First way using the Map.Entry
        //entry set contains set of entries and entry contains the key value pair
        //Using For Each Method
        //calling the entryset()to return the entries and getting the key value from each entry
for(Map.Entry<String ,Integer> kv :numberMapping.entrySet()){
    System.out.println("Key->"+kv.getKey()+ " :" +"Value->"+kv.getValue());

}
//Second Approach using Iterator
      Set<Map.Entry<String,Integer> > entries =numberMapping.entrySet(); //getting the entries

 Iterator<Map.Entry<String,Integer>>itr =  entries.iterator();//passing the entries to the iterator
while (itr.hasNext()){
    Map.Entry<String,Integer> entry = itr.next(); // getting the Key value from the Entry
    System.out.println(entry.getKey()+" : "+ entry.getValue());
}
//Third Approach
        numberMapping.forEach((k,v)->{System.out.println("Key :"+k);
        System.out.println("Value : "+v);});
    }


}
/*
KeyNotes :
if you want to use Iterator
first convert map to set
second use Iterator () to iterate the elements
third get the key and value from the itr.next
last sysout */
