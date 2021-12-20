package com.methodoverridein;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int n = st.nextInt();
        if(n%2==1){
            System.out.println("printWeird");
        }
        else if(n%2==0){
        if(n>=2 && n<=5){
            System.out.println("print Not Weird");

        }
        else if((n>=6 && n<=20)){
            System.out.println("printWeird");
        }
        else{
            System.out.println("print Not Weird");
        }
        }
    }
}
