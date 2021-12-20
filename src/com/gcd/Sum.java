package com.gcd;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int dividend1 = st.nextInt();
            int divisor1 = st.nextInt();
            int dividend2 = st.nextInt();
            int divisor2 = st.nextInt();
            Sum sum = new Sum();
            int combinedremainder = sum.gcd(divisor1, divisor2);
            System.out.println("GCD: " + combinedremainder);
            int combinednum = sum.numerator(dividend1,dividend2,divisor1, divisor2);
            System.out.println("Numerator: " + combinednum);

//System.out.println(combinedremainder);
            sum.Aggregate(combinedremainder, combinednum);
            System.out.println("##########");
        }
        newuinirg

    }
    public int gcd(int divisor1, int divisor2) {

        int remainder = divisor1 * divisor2;
        return remainder;
    }
    public int numerator(int dividend1, int dividend2 ,int divisor1, int divisor2){
        int numerator1 = dividend1*divisor2;
        int numerator2 = dividend2*divisor1;
        int combined = numerator1+numerator2;
        return combined;
    }
    public void Aggregate(int combinedremainder,int combinednum){

        System.out.println("Result of input:"+combinednum+"/"+combinedremainder);
    }
}
