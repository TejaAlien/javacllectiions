package com.sortverizon;

import com.maps.HackerMapsprogram;

import java.util.*;
import java.util.stream.Collectors;

public class Maptolist {
    public static void main(String[] args) {
        List<Personv> list = new ArrayList<>();
        list.add(new Personv(1,"Raavi","nandas","vjsa"));
        list.add(new Personv(2,"siva","nandea","vja"));
        list.add(new Personv(3,"suni","nandwa","vjwa"));
        list.add(new Personv(4,"sree","nandaf","vjwwa"));
        Map<Integer,String> map = list.stream()
                .collect(Collectors.toMap(p->p.getId(),q->q.getFirtname()));//<--please give the key and value
        //giving key as getid of type Integer and value as getfirstName of type string
        Map<String,String> lmap = list.stream()
                .collect(Collectors.toMap(Personv::getLastName,Personv::getArea));
        //giving key as getlastname and value as getAREA OF TYPE STRING
        System.out.println(map);
        System.out.println(lmap);
//My Approach to convert list to a map 
        Map<Integer,Personv> map1 = new HashMap<>();
        int count =1;
        for(int i =0;i<list.size();i++){


            map1.put(count,list.get(i));
            count++;
        }
        for(Map.Entry<Integer,Personv>entry:map1.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }

}
