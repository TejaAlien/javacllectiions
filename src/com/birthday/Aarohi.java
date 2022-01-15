package com.birthday;

import java.util.Scanner;

public class Aarohi {
    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);
        String name = st.next();
        char[] ch = name.toCharArray();
        int size =ch.length;

        for (int i = 0; i < ch.length; i++) {
            for (int j = i; j <= ch.length - 1; j++) {
                System.out.print(ch[j]+" ");
            }
            System.out.println(" ");
        }
            for (int k = ch.length-1; k >= 0; k--) {
                for (int j = ch.length-1; j >= k; j--) {
                    System.out.print(ch[j]+" ");
                }
                System.out.println(" ");
            }
        }
    }
