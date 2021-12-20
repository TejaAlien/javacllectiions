package com.youcanwin;

import java.util.Scanner;

public class Youcan {
    static boolean trueorfalse(int leap, int[] games){

return true;
    }
    public static void main(String[] args) {
            Scanner st = new Scanner(System.in);
            int queries = st.nextInt();
            System.out.println("Number of queries:"+queries);
            for(int i =0; i<queries;i++){
                int size = st.nextInt();
                System.out.println("Array size:"+size);
                int leap = st.nextInt();
                System.out
                        .println("Leap Size:"+leap);
                int[] games = new int[size];
                for(int k =0;k<size;k++){
                    games[k]=st.nextInt();

                }
                for(int j =0;j< games.length;j++){
                    System.out.print(" "+ games[j]);
                }
                Youcan.trueorfalse(leap,games);
            }

    }
}
