package Leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Arraysds {
    public static void main(String[] args) {
         String[] names = new String[]{"were","ewrewr","eqrere","qerere"};
         Map<Integer,String> m = new HashMap<>();
         for(int i =0;i<names.length;i++){
             m.put(i,names[i]);
         }
      m.forEach((k,v)->{System.out.println("Key:"+k);System.out.println("value:"+v);});
        List<Integer> ls = Arrays.asList(1,2,3,45,7);
        //converting list to list array
        int[] intarray = ls.stream().mapToInt(k->k).toArray();
        for(Integer k:intarray){{
            System.out.println(k);
            ////
        }}
        Map<Integer,Integer> map = ls.stream().collect(Collectors.toMap(i->i,j->j));
        map.forEach((k,v)->{System.out.println("key"+k);System.out.println("value:"+v);});

    }
}
