package com.Inheritence;

public class Adder extends Arithmetic{
    public static void main(String[] args) {
        Adder a = new Adder();
       int sum =  a.add(12,30);
System.out.println("My super class is: "+a.getClass().getSuperclass().getName());
        System.out.println(sum);
    }
}
