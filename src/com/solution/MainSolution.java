package com.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainSolution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);


        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(Integer i: list){
           // Integer j = map.get(i);
            map.put(i,(map.get(i)==null)? 1:map.get(i)+1);
        }

        for(Map.Entry<Integer,Integer> result : map.entrySet()){
            System.out.println("Element"+result.getKey()+": "+result.getValue());
        }

    }
}
