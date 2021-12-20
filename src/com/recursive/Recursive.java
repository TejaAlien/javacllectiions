package com.recursive;

import java.util.Scanner;

public class Recursive {

    public static void main(String[] args) {
//10,9,8,7,6,5,4,3,2,1


      //  aggregate(j);
        System.out.println(aggregate(10));
    }
    static int aggregate(int k){
        if(k>0) {
            return k + aggregate(k - 1);
        }
        else{
            return 0;
        }
    }
}