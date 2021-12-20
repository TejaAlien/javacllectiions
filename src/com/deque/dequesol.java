package com.deque;

import java.util.ArrayDeque;
import java.util.Deque;
//addfirst , addlast, removefirst, remoelast, getfirst, getlast (methods to add , remove and get )
// pop(to remove the element from the head of the queus)
//contains(to check the element)
//poll(to retrieve and remove the elements)
//peak to retreive the element but not removed it
//peaklast, peakfirst to retreive  the firs an dlast element.
public class dequesol {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.peek();
        System.out.println(deque.peek());
        System.out.println(deque);
        System.out.println("deque.pop remove the head of the queue: "+deque.pop());
        System.out.println(deque);
        deque.poll();
        System.out.println(deque);
        System.out.println(deque.poll());
        deque.poll();
        System.out.println(deque);
    }
}
//keyNote: Deque and queue interface implemented by ArrayDeque and LinkedListDeque classes has methods like addfirst to add first
//addlast to add to the last
//pop() to remove the element from the head of the queeu
//peak() to retrive the element
//poll() to remove the element