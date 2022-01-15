package com.defaultmethod;
//Using default we can implement the method inside the interface also
//create a implclass for creating the interface obj and execute the show method
public interface Student {
    default void show(){
        System.out
                .println("Hello students");
    }
}
class Studentimpl implements Student{

}
class Default{
    public static void main(String[] args) {
     Student student = new Studentimpl();
     student.show();
    }
}
