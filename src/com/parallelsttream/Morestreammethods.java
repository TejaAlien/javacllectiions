package com.parallelsttream;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Morestreammethods {
    public static void main(String[] args) {
        //using skip() we are skipping from 1 to 5
        IntStream.range(1,10).skip(5).forEach(i->System.out.println(i));
//using sum() to calculate the sum starting index value to the end-1 index value
      int result =   IntStream.range(1,7).sum();
      System.out.println(result);
      System.out.println("Without sorted");
        Stream.of("Ravi","Nanda","Teja","Suni","Siva","Shappo").forEach(String::new);
        System.out.println("with sorting:");
        Stream.of("Ravi","Nanda","Teja","Suni","Siva","Shappo").sorted().forEach(k->System.out.println(k));
        System.out.println("Printing the sorted first element by using findfirst().ifpresent() method");
        Stream.of("Ravi","Nanda","Teja","Suni","Siva","Shappo").sorted().findFirst().ifPresent(j->System.out.println(j));
      Stream.of("Ravi","Nanda","Teja","Suni","Siva","Shappo").sorted().findFirst().ifPresent(System.out::println);
        //Stream from an array filter, sorted and print
        String [] collection = {"ravi","Nanda","Sunny","siken","jack"};
        System.out.println("Filtering names started with S");
        Arrays.stream(collection).filter(name->(name.startsWith("S"))).map(String::toLowerCase).sorted().forEach(q->System.out.println(q));
        OptionalDouble avg= Arrays.stream(new int[]{2,4,5,7}).average();
        System.out
                .println(avg);
        Arrays.stream(new int[]{3,4,5,3}).map(x->x*x).average().ifPresent(i->System.out.println(i));
       // Stream from a list, filter and print
      List<String> stringList = Arrays.asList("Ravi","Rahul","Mehul","Kavul","Avul","rabi");
      System.out.println("Key Thing Don't forget:");
      stringList.stream().map(f->f.toLowerCase()).filter(name->name.startsWith("r")).sorted().forEach(print->System.out.println(print));
      //here we are using map to convert everyelement to lowercase and then filter with letter you want "r" I selected
      //map(String::toLowerCase) which is same as map(f->f.toLowerCase())
      String[] inpu = {"raiv","teja"};
      Arrays.stream(inpu);//<--Adding string array input toArrays.stream
      //Stream.of()-> to stream the string
      //findfirst()->optionlal to find the first string ispresent to check if it exists or not and print the name
      Stream.of("Ravi", "Teja","Nanda","Rahul","mehul").map(t->t.toLowerCase(Locale.ROOT)).filter(e->e.startsWith("r")).sorted().forEach(System.out::println);
    }
}
