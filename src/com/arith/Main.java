package com.arith;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int n = st.nextInt();
        AdvancedArithmetic a = new MyCalculator();
        System.out.println(a.divisor_sum(n));
    }
}
