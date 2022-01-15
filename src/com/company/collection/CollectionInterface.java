package com.company.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionInterface {

    public static void main(String[] args) {
	// write your code here
        //collection interface don't have direct implememtation
        Collection<String> fruitobjs = new ArrayList<>();
        fruitobjs.add("Banana");
        fruitobjs.add("Apple");
        fruitobjs.add("pineapple");
        fruitobjs.add("Banana");
       // System.out.println(fruitobjs);
       // fruitobjs.remove("Apple");
       // System.out.println(fruitobjs);
       // fruitobjs.stream().forEach(con->System.out.println(con));
        fruitobjs.stream().distinct().forEach(co->System.out.println(co));
        fruitobjs.forEach(o->System.out.println(o));
    }
}
/*
KeyNotes:
here Collection is a root level interface so List(all classes) , queue (all classes)and set(all classes) extends this Collection */
