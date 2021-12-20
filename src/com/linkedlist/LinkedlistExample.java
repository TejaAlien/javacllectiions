package com.linkedlist;

import java.util.LinkedList;

public class LinkedlistExample {
    public static void main (String[] a){
        //linkedlist(LL) allows duplicate values
        //LL follows insertion order
        //linkedList also implements Queue and Deque interfaces.
        //Therefore it can also be used as Queue , Deque or stack
        //ll is not thread safe
        // ll uses doubly linked list (DLL)(DLL contains collection of nodes consists of three parts)to store the elements .
        //LL consumes little bit more  memory than Arraylist because of nodes{p and N} . AL has index only
        //doubly linked list has previous pointer node , data (middle) node and next node [][][]
        //[P][D][N]<-[previous node][Data node][next node]-> [P][D][N]
        //insertion , addition and removal are faster in LL than arraylist (because of adjusting the indexes for new elements)

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("pomogranate");

        System.out.println("Before Insertion LL-> :"+ fruits);
        fruits.add(2,"Strawberry");
        System.out.println("After Insertion using add(index, element) method->:"+ fruits);

        fruits.addFirst("Grapes");
        System.out.println("Adding an Element at the beginning of the LL using addfirst method provide by Queue and Deque :"+fruits);
        fruits.addLast("pinapple");
        System.out.println("Adding an element at the end of the LL using addlast method provided by Queue and Deque :"+ fruits);
    }
}
