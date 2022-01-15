package com.optional;

import java.util.Optional;

public class OptioanalExample {
    public static void main(String[] args) {
       /* String[] s = new String[8];
        System.out.println(s[7].toLowerCase());*/
        // for the above 7,8 we will get nullpointerexception
        String[] b = new String[5];
       /* Optional<String> v = Optional.ofNullable(b[4]);//Optional.ofNullable(b[4]);will return string valueat index5 if there
        if(v.isPresent()){
            String print = b[5].toLowerCase();
            System.out.println(
                    b[5]
            );
        }
else{
    System.out.println("value is not present" );
        }
    }
}*/
        b[4] = "Hello I am good";
        Optional<String > check = Optional.ofNullable(b[4]);//here check has helloI am good so satisfies the below if condition
        //check has the optional<Hello I am good>
        if(check.isPresent()){
           String toupper = b[4].toUpperCase();
           System.out.println(toupper);
        }
        else{
            System.out.println("No value is present");
        }
    }//Keynotes:
    }// we are using optional for doing null checks prevents from null pointer exceptions
//Optional<String> check = Optional.ofNullable(b[4]) like this we mention to check that position is null or not
// if value present check has string value
//using ispresent->to check vlaue true or false
