package com.methodoverriding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flower {
    String whatsYourName(){

        return "I have many flowers";
    }
}
class Jasmine extends Flower{
    String whatsYourName(){
        return "Jasmine";
    }
}
class Lily extends Flower{
    String whatsYourName(){
        return "lily";
    }
}
class Region{
    Flower yourNationalFlower(){
        return new Flower();
    }
}
class WestBengal extends Region{
    Jasmine yourNationalFlower(){
        return new Jasmine();
    }
}
class AndhraPradesh extends Region{
Lily yourNationalFlower(){
    return new Lily();
}
}
 class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
       String h= flower.whatsYourName();
       System.out.println(h);
    }
}