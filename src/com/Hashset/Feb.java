package com.Hashset;

import java.util.Scanner;

public class Feb {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int n1 = st.nextInt();
        int n2 = st.nextInt();
        for(int i=0;i<50;i++){
            int n3 = n1+n2;


            System.out.println(n3);
            n1=n2;
            n2=n3;

        }
    }
}
