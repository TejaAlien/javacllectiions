package com.linkedlist.node;

public class LinkedListImpl {
   // These class need to have   certain methods
    //how do we now that list is a first node using head concept
    Node head;// this is the head node
    //inserting at end
public void insert(int data){
    // here we are creating new node
    Node node = new Node();// the moment we want to  insert 5 it will create a new node for you[[][]] same for 7
    node.data=data;  // and assigns [[5][]] // assigns 7
    node.next=null; //here it assigns [5][null] //assigns null
    if(head==null){// by default head is null //head is not empty already have 5
        this.head=node;//the first node obj itself is a head so we added 5 to head and has next node as null
    }
    //if is not first node
    else{//7 goes to else block and traverse from head to the nextnode until null
        Node n = head;// here we are traveling from first location (head)to the last location
        while(n.next!=null){
n=n.next;//we are jumping between the nodes


        }
        n.next = node;//the moment it finds  n.next==null replace it with the reference of the next node
        //head->[5 null ]-> after inserting 7
        //head-> [5 567]-> [7 null] now 7 next node is null
        //[5 567]->[7 456]->[9 null] now 9 is added last and it has next node null
//these above operations are inserting element at the end
    }

}
//inserting at start
public void insertAtStart(int data){
    Node nod = new Node();
    nod.data =data;
    nod.next=head; //will be the previous headnode
    head = nod;//head will be pointed to the node we created using insertatstart
    // we are inserting at start means the head is changing from 5 to the value we inserted at start 1 //1 will be the headnode
}
//inserting at any place
    public void insetAt(int index , int data){
Node node = new Node();
node.data = data;
node.next=null;
// we are traversing from head so

        if(index==0){
            insertAtStart(data);// for adding at 0 th index
        }
        Node n = head ;
           for(int i =0;i<index-1;i++){
                n = n.next; //here next itself is a next node so we have to use index-1
                //suppose we want to add element at 2 means we make changes at 1 means we jump from 0 to 1
                //i =0 means n.next is pointing to 1 so index should be -1
                //if we don't use index-1 then it is pointing to 2 not 1 we make changes at 1 not 2 so use index-1

            }
        node.next=n.next;// we are passing n.next reference to the node.next
n.next=node;//we are passing the reference of the added one to the n.next
    }
public void show(){
    Node node = head;
    while(node.next!=null){
        System.out.println(node.data);
        node =node.next;

    }
    System.out.println(node.data);
}
}
