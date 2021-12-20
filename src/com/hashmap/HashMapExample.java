package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//HashMap implements map Interface
//HashMap allows one null key and null values
//HashMap is not thread safe
//HashMap cannot contain duplicate keys
//hashmap is unordered collection
//Hashmpa is a hashtable based implementation of Map interface
//If key is already existed and add the another value to the same key it will replace the existing key

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> numbermapping = new HashMap<>();
        //put method is used to add the key ,value pair
        numbermapping.put("one",1);
        numbermapping.put("two",2);
        numbermapping.put("three",3);
        numbermapping.put("four",4);
        numbermapping.put("five",5);
        System.out.println(numbermapping);
        numbermapping.put(null,6);
        numbermapping.put(null,7);
        // If we assign one more value to the null key the existed value will be replaced with the current value
        //Accepts only one null key
        System.out.println("we can store one null key in hashmap:->"+numbermapping);
       // numbermapping.put("one",2);//<-same key used twice so the previous key removed automatically, see below
        System.out.println("No duplicate keys are allowed:->"+numbermapping);
Boolean iskeyvaluepresent = numbermapping.isEmpty();
System.out.println("Check if hashmap is empty or not using isEmpty():->"+iskeyvaluepresent);
Integer size = numbermapping.size();
System.out
        .println("Size of the HashMap: "+size);
// check If a key exists in the HasMap or not using containsKey()
    if(numbermapping.containsKey("four")){
        System.out.println("Key Exist");
    }else{
        System.out.println(" Key Not Exist");
    }
    Boolean iskeyPresent = numbermapping.containsKey("two");
    System.out.println("Return true if Key Exists:->"+ iskeyPresent);
    //Check If a value exist in the hasp map or not
        if(numbermapping.containsValue(5)){
            System.out
                    .println("Value Exist");
        }
        else{
            System.out
                    .println("Value Not Exist");
        }
        Boolean isvaluePresent = numbermapping.containsValue(3);
        System.out
                .println("Return true if value present in the hashmap:->"+ isvaluePresent);

        //get value by Key using getkeymethod
       System.out.println("Get the value by Key:->"+ numbermapping.get("One"));
       System.out.println("Before removing the Key:->"+numbermapping);
       //How to remove the keys from the hashmap
        System.out.println(numbermapping.remove("one"));
        System.out
                .println("After removing the Key:->"+numbermapping);
    }

}

//keynotes : inhashmap the existed value is replaced with the current value if both the keys are null