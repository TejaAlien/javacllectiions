package com.javareflectionattributes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaReflectionAtrributes {
    public static void main(String[] args) {
        // creating object for the Student class
Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();
        List<String> listmethods = new ArrayList<>();
        for(int i=0;i< methods.length;i++){
            listmethods.add(String.valueOf(methods[i]));
        }
        Collections.sort(listmethods);
        for(String methodname: listmethods){
            System.out.println(methodname);
        }
    }}


