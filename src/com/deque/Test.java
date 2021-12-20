package com.deque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int maxCount=0;
        int prevDistinct = 0, currentDistinct =0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if(i<m){
                if(!deque.contains(num))
                    maxCount++;
                deque.push(num);
                currentDistinct=prevDistinct=maxCount;
            }
            else{
                int removed = deque.removeLast();

                if(!deque.contains(removed)){
                    currentDistinct = prevDistinct-1;
                }

                if(!deque.contains(num)){
                    currentDistinct++;
                }

                deque.push(num);
                if(maxCount<currentDistinct){
                    maxCount=currentDistinct;
                }
                prevDistinct=currentDistinct;
            }
        }
        System.out.println(maxCount);
    }
}