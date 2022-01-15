package com.linkedlist.node;

public class Linkedlistteluskosample {
    public static void main(String[] args) {
        // 5 , 12, 6, 8,9
        //[[info/value][address of the next node]]<--each node has info and address
        //[5][12][6][8][9]
        //here the first obj(5) will have the reference of second obj
        //and second obj will have the reference of third obj ..
        //the last obj will have the reference of null
        // when we add one more node after the last then the null will shift to
        //the last added one

        // in order to implement the linkedlist we need obj of Node
        // So we need to create a Node class which has data and next (reference)
       /* class Node{
            int data; //data of anytype
            Node next;//has next Node
        }*/
       /* and we need to create a linked list class
                insert(5);<-- insert() add the element 5  at last
        insertAt(3,12);<--- insertAt() method add the element 12 at index 3
        insertAtstart(7);*///insertAtStart() method add the element at the head now head changes from 5 to 7 and 5 is the second element
       // delete(4)<-- delete method deletes the value at index 4
        //show()<-- show method is used to display all the elements
      // 1. we need node class , 2.linkedlistclass and 3.main() to run these operations specified above
        //let's go first we will create a Node class
    }
}
