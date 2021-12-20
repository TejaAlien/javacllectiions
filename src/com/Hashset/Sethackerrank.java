package com.Hashset;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Sethackerrank {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int size = st.nextInt();
        Set<String> set = new HashSet<>();
        for (int i=0; i<size;i++){
            String left = st.next();
            String right = st.next();
            set.add(left+" "+right);
        }
        st.close();
        System.out.println(set);
    }
}
