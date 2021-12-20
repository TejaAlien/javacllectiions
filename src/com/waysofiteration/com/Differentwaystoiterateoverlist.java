package com.waysofiteration.com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Differentwaystoiterateoverlist {
    public static void main (String[] a ){
        List<String> lobj = Arrays.asList("ravi","nanda","Suni","Siva", "Sridevi");
        System.out.println("Basic for loop:");
        for (int i =0; i<lobj.size(); i++){
            System.out.println(lobj.get(i));
        }
        System.out.println("Enhanced for loop:");
        for(String s : lobj){
            System.out.println(s);
        }
        System.out.println("Foreach loop +Stream +Lambda Exp<--java8:");
        lobj.stream().forEach(q->{System.out.println(q);});
        System.out.println("Using Iterator iterates the list of elements: ");
        Iterator<String> itr = lobj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("without stream foreach loop+lambda Exp:");
        lobj.forEach(r->{System.out.println(r);});
    }


}
