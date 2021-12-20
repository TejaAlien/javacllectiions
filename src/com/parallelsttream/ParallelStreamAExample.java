package com.parallelsttream;

import java.util.stream.IntStream;

public class ParallelStreamAExample {
    // the performance is fast when compared to normal stream
    // because normal stream uses one core to process the data and in a sequential way
    //parallel core uses multiple cores to process it and it's not following sequential way
    public static void main(String[] args) {
        int end =0;
        int start =0;
        start= (int) System.currentTimeMillis();
        IntStream.range(1,100).forEach(i->System.out.print(i+" "));
        end =(int) System.currentTimeMillis();
        System.out.println("Time taken by normal stream"+(end-start));
        System.out.println("*******************************");
        start= (int)System.currentTimeMillis();
        IntStream.range(1,100).parallel().forEach(i->System.out.print(i+" "));
        end=(int)System.currentTimeMillis();
        System.out.println("Time taken by parallelstream"+(end-start));
    }
}
