package com.varargs;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;



public class Solution {

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
class Add{
       static void add(int n1, int n2){
            int z = n1+n2;
           System.out.println(n1 +"+"+ n2 +"="+z);
        }
   static void add(int N1, int N2 ,int N3){
        int z = N1+N2+N3;
        System.out.println(N1 +"+"+ N2 +"+"+ N3+ "="+z);
    }
   static void add(int p1, int p2,int p3 , int p4, int p5){
        int z = p1+p2+p3+p4+p5;
        System.out.println(p1 +"+"+  p2 +"+"+ p3 +"+"+  p4 +"+"+  p5 +"="+z);
    }
   static void add(int q1, int q2 , int q3, int q4 , int q5 , int q6){
        int z = q1+q2+q3+q4+q5+q6;
        System.out.println(q1 +"+"+ q2 +"+"+  q3 +"+"+  q4 +"+"+  q5 +"+"+  q6 +"="+z);
    }
    }

}
