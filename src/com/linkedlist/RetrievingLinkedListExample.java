package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

// 1.how to get the first element in LL
//2.how to get the Last element ion LL
//3.how to get the element at the given index in the linkedlist
//4.how tpo get all the elements from the LL
public class RetrievingLinkedListExample {
    public static void main (String[] a){
        LinkedList<String> phones = new LinkedList<>();
        phones.add("Samsung");
        phones.add("Apple");
        phones.add("motorolla");
        phones.add("Nokia");
       //String firstelement =  phones.get(3);
       System.out.println("using get(index) fetching the element (3):"+phones.get(3));

       System.out.println("Using getFirst() to fetch the element (1):"+phones.getFirst());
       System.out.println("using getlast() to fetch the last element (2)"+ phones.getLast());
       System.out.println("Retrieving all elements uisng enhanced for loop");
       for (String s : phones){
           System.out.println(s);
       }
System.out.println("Different ways to retreive Uisng basic forloop:");
       for(int i=0 ; i<phones.size();i++){
           System.out.println(phones.get(i));
       }
        System.out.println("Different ways to retreive using Iterator:");
        Iterator<String> itr = phones.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Using foreach Lamda + Stream :");
        phones.stream().forEach(p->System.out.println(p));
        System.out.println("Without streams: ");
        phones.forEach(q->{System.out.println(q);});
    }
}
