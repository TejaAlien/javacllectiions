package com.recursive;

import java.util.Scanner;

public class Newapproach {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int n = st.nextInt();
        Integer[] arr = new Integer[n];
        for(int i =n-1 ; i>=0;i--){
            if(i>=0){
            arr[i]=i;
            System.out.print( " "+ arr[i]+" ");}
            else{
                return;
            }
        }
        int count = n;
        for(int i =n-1;i>=0;i--){
            count = count+arr[i];
        }
        System.out.println(" "+"Result: "+ count);
      //  System.out.println();
        for(Integer m:arr){
           System.out.print(" " +m);
        }
        for(int d=0; d>=0;d++){
            System.out.println("index of the array at position :"+ d +" is:"+ arr[d]);
        }
    }
}
