package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);

     int[] lenght = list.stream().mapToInt(i->i).toArray();
     for(Integer f :lenght){
         System.out.println(f);
     }
    }
    }

