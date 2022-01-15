package com.parallelsttream;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting {
    public static void main(String[] args) {

        Stream.of("Ravi","Teja","Nanda","Rakhi").forEach(i->System.out.println(i));
System.out.println("Sorting:");
        Stream.of("Ravi","Teja","Nanda","Rakhi").sorted().forEach(i->System.out.println(i));
       List<String > collect =  Stream.of("Ravi","Teja","Nanda","Rakhi").map(j->j.toLowerCase(Locale.ROOT))
                .filter(k->k.startsWith("r")).sorted().collect(Collectors.toList());
       System.out.println(collect);
       String[] cc = {"ravi","teja","nanda"};
        Arrays.stream(cc).forEach(k->System.out.println(k));
        Arrays.stream(new int[]{1,2,3,1,3}).distinct().forEach(d->System.out.println(d));
      OptionalDouble av =  Arrays.stream(new int[]{1,2,3,1,3}).map(x->x*x).average();
      System.out.println(av);
     int s=   Arrays.stream(new int[]{1,2,3,1,3}).sum();
     System.out.println(s);
        Stream.of("Ravi","Teja","Nanda","Rakhi").findFirst().ifPresent(o->System.out.println(o));
    }
}
