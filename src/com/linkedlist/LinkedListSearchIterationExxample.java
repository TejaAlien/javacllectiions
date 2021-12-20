package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSearchIterationExxample {
    public static void main(String[] a){
        LinkedList<String> phones = new LinkedList<>();
        phones.add("Apple");
        phones.add("Samsung");
        phones.add("Motorolla");
        phones.add("LG");
        phones.add("LG");
     Boolean isPresent =    phones.contains("Apple");
        System.out.println("Contains method is used to check the element present or not: " +
                "If present returns true : -> " +
                ""+isPresent);
        phones.stream().distinct().forEach(p->System.out.println(p));
        System.out.println(phones);
        int index = phones.indexOf("Motorolla");
        System.out.println("Indexof returns the index of the element:" + index);
       int lastindex =  phones.lastIndexOf("LG");
        System.out.println("Retruns the last occurenece of the element:" +lastindex);
        //Using Iterator
        Iterator<String> itr = phones.iterator();
        while(itr.hasNext()){
            System.out
                    .println("Using Iterator : -> "+itr.next());
        }
        for(String s : phones){
            System.out.println("Using Enhanced for loop:->"+s);
        }
        for (int i=0;i<phones.size();i++){
            System.out.println("Basic for Loop:->"+phones.get(i));
        }
        System.out.println("Using ForEach lambda+stream :");
        phones.stream().forEach(t->{System.out.println(t);});
    }
}
