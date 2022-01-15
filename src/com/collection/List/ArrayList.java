package com.collection.List;

import java.util.Arrays;
import java.util.List;

public class ArrayList {
    public static void main (String [] a){
    /*   String ss= "thftfygyu6tygug";
     String[] s12=  ss.split("y");
     for(int i=0;i<s12.length;i++){
         System.out.print(s12[i]+" ");
     }
    for(String l:s12){
       System.out.println(l);
    }
    for(int i=0;i<s12.length;i++){
       System.out.println(s12[i]);
    }
       Arrays.stream(s12).forEach(r->System.out.println(r));*/
      //  Arraylist is a class which implements list interface and list interface extends the collection interface
       //Al internally uses Array to store the elements
       //AL is dynamic in size
       //AL is better for storing and accessing the data
       //Minipulation is difficult in Al because of the bits are shifted in memory
       List<String> s = new java.util.ArrayList<>();
       System.out.println(s.isEmpty());
      // List<String> s = new java.util.ArrayList<>(3);
       s.add("modi");
       s.add("vajpayee");
       s.add("mamatha");
       s.add("modi");
       s.add("null");
       //modify the element at the given index
       s.set(1,"Atalbihari");
       //remove the element at the given index
       s.remove(0);

        //*******.get(index) is used to extract the specific element present in that index************
        //list allows the duplicate elements
        //list allows the null elements

        //Arraylist uses dynamic Array
        //Arraylist increases and decrease its size based on requirement
        //Arraylist class extends the abstract list
       //Default capacity of Arraylist is 10
       //You cannot create a Arraylist of primitive datatypes like int, char etc, you need to use the wrapper classes like
       //String, Integer, character, Boolean like that

       System.out.println(s.get(0));
       System.out.println(s);

       System.out.println("**To print the distinct elements in the list as shown in below:**");
       s.stream().distinct().forEach(s1 -> System.out.println(s1));
System.out.println(s.size());
List<String> sublist = s.subList(1,3);
System.out.println(sublist);
for(String k:sublist){
   System.out.println(k);
}
    }
}
//keynotes : .get to retrieve and .remove to remove the elements
//.sublist to split the array from the starting index into end-1 index of the list which returns the listobj
//List<String> sublist = s.sublist(startindex, endindex)
//sublist is used to split the array
//list<String> sublist = s.sublist(start,end)
