package com.solution;
//sorting by the lenght of the element

import java.util.*;

public class Sortbylength {
    public static void main(String[] args) {
       List<String> list = new ArrayList<>();
        list.add("ab");
        list.add("a");
        list.add("cdef");
        list.add("abd");
//key should be lenght of the element

list.stream().map(g->g.toUpperCase(Locale.ROOT)).filter(n->n.startsWith("c")).forEach(x->System.out.println(x));
      /*  Collections.sort(list, Comparator.comparing(String::length));
        list.forEach(System.out::println);*/
    }
}


