package com.linkedlist;

import java.util.LinkedList;
//1. how to remove the first element in the linked list
// how to remove the last element in the linked list
//how to remove the first occurrence of a given element in the linked list
//how to clear the linked list completely


public class RemoveElementsLinkedListExample {
    public static void main (String[] a){

        LinkedList<String> phones = new LinkedList<>();
        phones.add("Apple");
        phones.add("Nokkia");
        phones.add("samsung");
        phones.add("LG");
        phones.add("Motorolla");
        System.out.println("Before removing the elements:"+ phones);
       System.out.println("(1) Using removefirstmethod:"+ phones.removeFirst());
       System.out.println("After removing the firstelement:"+phones);
       System.out.println("(2)Uisng removeLastMethod:"+phones.removeLast());
        System.out.println("After removing the Laastelement:"+phones);
        System.out.println("Removing the element uising Index :"+phones.remove(0));
        System.out.println("After removing that element uisng remove index:"+phones);
        System.out.println("removing the element using remove obj method:" + phones.remove("LG"));
        System.out.println("After removing the element using remove object method:"+ phones);
        phones.clear();
        System.out.println("Clear method is used to clear the list:"+ phones);
    }

}
