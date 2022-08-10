package com.collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveelemetsfromtheArraylist {
    public static void main (String [] a) {
        //  Arraylist is a class which implements list interface and list interface extends the collection interface
        List<String> s = new java.util.ArrayList<>();
        System.out.println("No elements present so: " + s.isEmpty());
        // List<String> s = new java.util.ArrayList<>(3);
        s.add("modi"); // index:0
        s.add("vajpayee");//1
        s.add("mamatha");//2
        s.add("modi");//3
        s.add("sai");//4
        System.out.println("Before removing: "+s);
        s.remove(2);
        System.out.println("After removing the element using the index: "+ s);
       /* List<String> removeobjs = new ArrayList<>(s);
        System.out.println(removeobjs);
        removeobjs.removeAll(s);
        System.out.println(removeobjs);*/
        // whatever elemtents syou want to remove put it in a separrate list and remove that collection
        List<String> ss = Arrays.asList("ffre","ferfer","regeg");
        System.out.println(ss);
        List<String> substringremoveobjs = new ArrayList<>();
        substringremoveobjs.add("modi");
        substringremoveobjs.add("vajpayee");
        s.removeAll(substringremoveobjs);
        System.out.println(s);
       s.clear();
       System.out.println(s);
    }
}
