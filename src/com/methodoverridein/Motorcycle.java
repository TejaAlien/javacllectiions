package com.methodoverridein;

public class Motorcycle extends Bicycle{
    String defineMe(){
        return "A cycle with engine";
    }
    Motorcycle(){

        System.out.println("Hello I am a Motorcycle I am"+ defineMe());
       String temp=  super.defineMe();
       System.out.println("My ancestor is a cycle who is :"+ temp);
    }
}
class Main{
    public static void main(String[] args) {
        Motorcycle m = new Motorcycle();

    }
}