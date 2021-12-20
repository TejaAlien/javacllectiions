package com.Lambdademo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface C{
    void show (int i);
}
public class Lambdawithparam {
   /* public static void main(String[] args) {
        C obj;
        obj=i->{System.out.println(i);};
        obj.show(2);// we are passing 2 it goes to the lambda exp and print it
    }*/
   public static void main(String[] args) {


       List<Integer> list = Arrays.asList(12, 23, 654, 765, 3453);
       //normal Approach to print
       for (int i = 0; i < list.size();i++){
           System.out.println(list.get(i));
       }
       System.out
               .println("Enhanced Approach:");
       //Enhanced Approach to print
       for(Integer j:list){
           System.out.println(j);
       }
       //for each to print
       System.out.println("For each with lambda");
       list.forEach(i->System.out.println(i));//lambda //ConsumerInterface //@functionalInterface and has accept method
   }
}
