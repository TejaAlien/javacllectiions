package com.sortedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main (String[] a){
        List<Integer> l = Arrays.asList(10,40,30,450,90,67);//one way to add elements is a list
       /* List<Integer> otherway = new ArrayList<>();//other way to add elements in a list
        otherway.add(10);
        otherway.add(40);
        otherway.add(30);
        otherway.add(450);
        otherway.add(90);
        otherway.add(67);*/
        //System.out.println(l.get(2));
        System.out.println("Sort the list in ascending order using sort method:");
        Collections.sort(l); // Collections.sort() sort the list in ascending order
        System.out.println(l);
        System.out.println("Sort the list in descending order using reverse method:");
        Collections.reverse(l);
        System.out.println(l);
    }
}
