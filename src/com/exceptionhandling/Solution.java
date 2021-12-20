package com.exceptionhandling;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int N = st.nextInt();
        int P = st.nextInt();
        Mycalculator mycalculator = new Mycalculator();
        try{


        long u=  mycalculator.power(N,P);
        System.out.println(u);}
        catch (Exception ef){
            System.out.println(ef);
        }
    }

    }
    class Mycalculator{
        long power(int n, int p) {

            if (n < 0 && p < 0) {
                try {

                    long z = (long) Math.pow(n, p);
                    return z;
                } catch (Exception ex) {
                    System.out.println("java.lang.Exception: n and p should not be negative.");
                }
            } else if (n < 0 || p < 0) {
                try {
                    long z = (long) Math.pow(n, p);
                    return z;
                } catch (Exception exception) {
                    System.out.println("java.lang.Exception: n or p should not be negative.");
                }
            } else if (n == 0 && p == 0) {
                try {
                    long z = (long) Math.pow(n, p);
                    return z;
                } catch (Exception exception) {
                    System.out.println("java.lang.Exception: n and p should not be zero.");
                }
            } else {
                long z = (long) Math.pow(n, p);
                return z;
            }
            return 0;
        }
}
/*
class myCalculator{

    public long power(int n,int p)throws Exception{
        if(n<0 || p <0)
            throw new Exception("n and p should be non-negative");
        return (long)Math.pow(n,p);
    }
}*/
