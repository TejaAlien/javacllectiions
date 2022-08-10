package com.heli;

public class Heli {
    @Override
    public String toString() {
        return "Heli{}";
    }

    public static void main (String[] args){
        
        
        char [][] x = new char[20][21];
        for(int i=0;i<20;i++) {
            char x1 = 'x';
           x[i][i]=x1;
            System.out.print (x[i][i]+" ");
        }

    }
}
