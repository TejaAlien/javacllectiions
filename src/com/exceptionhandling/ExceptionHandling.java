package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        try{
            int x = st.nextInt();
            int y = st.nextInt();
            int z = x/y;
            System.out.println(z);
        }
        catch(InputMismatchException ex){
            System.out.println(ex.fillInStackTrace());
        }


    }
}
