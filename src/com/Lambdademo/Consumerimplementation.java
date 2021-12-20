package com.Lambdademo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*public class Consumerimplementation implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }*/
    //here the above class implementing the consumer interface so use ananymous inner class
    //instead of creating a seperate class so commented out 7-11

    class Main{
        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(1,4,4,55,5,56);
            //hence the accept method is already defined in consumer interface so remove from new to accept
          /*  new Consumer<Integer>() {
                @Override
                public void accept*/
           /* Consumer<Integer> c = new Consumer<Integer>() {
                @Override
                public void accept(Integer integer) {
                    System.out.println(integer);
                }
            };*/
            Consumer<Integer> c = (Integer integer)->System.out.println(integer);
            list.forEach(c);//in foreach we are passing consumerobj
list.forEach(integer -> System.out.println(integer));//we can write like this also
        }
    }

