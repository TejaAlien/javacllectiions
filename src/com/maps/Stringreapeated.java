package com.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Stringreapeated {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        String enter = st.next();
        char[] ch = enter.toCharArray();

        Map<Character ,Integer> map = new HashMap<>();
       /* for(int i=0; i<ch.length;i++){
            if(map.containsKey(ch))
        }*/
        for(char value : ch){
            if(Character.isAlphabetic(value)){
                if(map.containsKey(value)){
                    map.put(value,map.get(value)+1);
                }
                else{
                    map.put(value ,1);
                }
            }
        }
        System.out
                .println(map);
    }
}
