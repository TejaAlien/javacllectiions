package com.Hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
// No duplicate elements are allowed in hash set because it implements set interface
// It allows only one null value
// It doesn't follow insertion order , It's an unordered set
//Hash set internally uses hashmap to store its elements ,see below:
/* class HashSet{
 public Hashset(){
     map = new HashMap<>()
 }*/
//Hashset is not threadsafe

public class HashsetExample {
    public static void main(String[] a){
        Set<String> phones = new HashSet<>();
        phones.add("Apple");
        phones.add("Samsung");
        phones.add("Motorolla");
        phones.add("LG");
        phones.add("LG");

        System.out.println("No duplicate elements are allowed in hash set:-> "+ phones);
        phones.add(null);
        phones.add(null);
        System.out.println("It allows only one Null value"+ phones);
    }
}
