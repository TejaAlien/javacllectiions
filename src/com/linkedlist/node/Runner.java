package com.linkedlist.node;

import java.util.LinkedList;
//12,6,8,7,3
public class Runner {
    public static void main(String[] args) {/*
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12); //same as insert method
        list.add(6);
        list.add(8);
        list.add(7);
        list.add(3);
        list.add(3,12);//same as insertAt(3,12);<--- insertAt() method add the element 12 at index 3
//here these are all internal implementation of a linkedlist but I want
        //my own implementation for that I am creating my own class Linkedlistimpl*/
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.insert(5);//this value passes to the method and assigns to the node
linkedList.insert(7);
linkedList.insert(9);
linkedList.insetAt(3,4);
linkedList.insert(2);//here node.next is null so we explicitly use sysout to print the data
        linkedList.insertAtStart(1);
        //1 5 7 9 2
        linkedList.insetAt(0,8);
linkedList.show();


    }
}
