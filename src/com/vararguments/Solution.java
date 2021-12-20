package com.vararguments;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Solution {
   /* class Add{
        static void add(int ... numbers){
            int sum = 0;
            int index;
            for(index = 0; index < numbers.length - 1; index++){
                sum += numbers[index];
                System.out.print(numbers[index] + "+");
            }
            sum += numbers[index];
            System.out.println(numbers[index] + "=" + sum);
        }
    }*/
   class Add {
       static void add(Integer... arguments) {
           Integer numArgs = arguments.length;
           Integer total = 0;
           StringBuilder sb = new StringBuilder();

           for(int i =0; i < numArgs; i++) {
               Integer arg = arguments[i];
               total += arg;

               if(i != 0) {
                   sb.append("+");
               }
               sb.append(arg);
           }

           sb.append("=").append(total);
           System.out.println(sb.toString());
       }
   }
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());

            Add.add(n1,n2);
            Add.add(n1,n2,n3);
            Add.add(n1,n2,n3,n4,n5);
            Add.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=Add.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }




}

