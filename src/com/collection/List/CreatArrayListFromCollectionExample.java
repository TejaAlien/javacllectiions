package com.collection.List;

import java.util.ArrayList;
import java.util.List;
//How to create an Arraylist from anothercollection using the
//Arraylist(collection c ) constructor
public class CreatArrayListFromCollectionExample {

    public static void main (String[] a){

        List<String> vowels = new ArrayList<>();
        vowels.add("A");
        vowels.add("E");
        vowels.add("I");
        vowels.add("O");
        vowels.add("U");
        System.out.println(vowels);
        //creating the another AnotherArraylist and passing the collection obj in the constructor (vowel)
        List<String> vowelsplus2consonents = new ArrayList<>(vowels);
        List<String> consonents = new ArrayList<>();
        consonents.add("B");
        consonents.add("C");
        vowelsplus2consonents.addAll(consonents);
        System.out.println(vowelsplus2consonents);

    }
}
//KeyNote:.add , addall,.remove,.removeall