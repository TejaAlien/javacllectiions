package com.tagcontentetractor;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tagcontentextractor{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            Matcher m = Pattern.compile("<(.+)>(([^<>]+))</\\1>").matcher(line);

            if (!m.find()) {
                System.out.println("None");
                continue;
            }

            m.reset();
            while (m.find()){
                System.out.println(m.group(1));
            }
            testCases--;
        }
    }
}