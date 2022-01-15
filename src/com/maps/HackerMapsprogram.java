package com.maps;

import java.util.*;

public class HackerMapsprogram {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int size = st.nextInt();
        Map<String,Integer> map =new HashMap<>();
        for(int i=0 ; i<size; i++){
            String names = st.next();
            Integer cell = st.nextInt();
            map.put(names ,cell
            );
        }
        System.out.print(map+ " ");
        int queries = st.nextInt();
        for(int z=0;z<queries;z++){
        Set<String> keys = map.keySet();
        List<String> listkeys = new ArrayList<>(keys);

        for(int i=0; i<listkeys.size();i++){
            String entername = st.next();
            for(int j =i;j<listkeys.size();j++){
            if(listkeys.get(j).equals(entername)){
                System.out.println("found at index: " + j+" " +listkeys.get(j)+" "+map.get(entername));
            }
            else{
                System.out.println("Not found at index:"+j);
            }
            }
            System.out
                    .println(" ");
        }
        }

    }
}
