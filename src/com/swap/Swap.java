package com.swap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Swap {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        String input = st.next();
        int N = Integer.parseInt(input);
        List<Integer> ar = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int values = st.nextInt();
            ar.add(values);
        }
        swapping(ar);
    }

    public static List<Integer> swapping(List<Integer> arr) {
        List<Integer> newar = new ArrayList<>();
        Integer[] inar = new Integer[arr.size()];


        for (int h = 0; h < arr.size(); h++) {
            inar[h] = arr.get((arr.size() - (1)) - h);

     newar.add(inar[h]);
        }
        List<Integer> result = newar.stream().toList();
        System.out.println(result);
        return result;
    }

}