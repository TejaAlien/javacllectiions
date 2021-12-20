package com.Hashset;

import java.util.*;

// create a hashset from one collection to another collection using the HashSet(Collection c) constructor
//Add all elements from the collection to the hashset using addall()method
//we can use iterator, enhanced for loop , foreach to iterate the elements
// we can't use basic for loop because of elemnets not string based on the index
public class CreateHashSetForCollectionExample {
    public static void main (String[] a){
        Set<String> phones = new HashSet<>();
        phones.add("Apple");
        phones.add("Samsung");
        phones.add("Motorolla");
        phones.add("LG");
        System.out.println("Before adding : " + phones);
        System.out
                .println("Iterating elements using enhanced for loop: ");
        for(String i : phones){

            System.out.println(i);
        }
        Set<String> addtoanothercollection = new HashSet<>(phones);
        System.out.println("Added to another collection uisng the Collection c constructor:"+addtoanothercollection);
        Set<String> somemorephones = new HashSet<>();
        somemorephones.add("Reliance Jio");
        somemorephones.add("One touch");
        somemorephones.add("blackberry");
        somemorephones.add("Alcadel");
       somemorephones.addAll(phones);
        System.out.println("Using iterator iterate the list of elements:");
        Iterator<String> itr = phones.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("After adding some more phones:" +phones);
        Set<String> removesomephones = new HashSet<>();
        removesomephones.add("Apple");
        removesomephones.add("LG");
        phones.removeAll(removesomephones);
        System.out.println("Uisng foreach loop:->");
        phones.stream().forEach(o->{System.out.println(o);});
        System.out.println("Removing some phones using removeall method by " +
                "By creating the anothe set and add phones to remove " +
                "And use that collection obj " +
                "use removeall():"+ phones);
        phones.remove("blackberry");

        System.out.println("removes blcakberry from the collection: "+ phones);
        System.out.println("Using filter :");
        phones.stream().filter(phone->!"Motorolla".equals(phone)).forEach(l->System.out.println(l));
        // if you want to get the elements fom hashset convert hashset into the array list and get it by using index

        List<String> s = new ArrayList<>(phones);
        System.out.println("convert hashset into Arraylist and get the element by index:-> "+ s.get(0));
        phones.clear();
        System.out
                .println("Clear method clears the list of elements :"+ phones);
    }
}
