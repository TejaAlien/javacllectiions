package com.duplicates;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);
        String field = st.next();

        char[] ch = field.toCharArray();
        Map<Character , Integer> map = new HashMap<>();

        for(Character c:ch){

            if(map.containsKey(c)){

                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }

        }
        for(Map.Entry<Character, Integer> ss: map.entrySet()){
            System.out.println(ss.getKey()+" Occurs "+": "+ss.getValue());
        }




    }
}
