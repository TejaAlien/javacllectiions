package com.listchecking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Listchecking {
    public static void main(String[] args) {
        List<String> nonfin = Arrays.asList("pddemo","pdindv","pdcaseaddress","pdburial");
        List<String> income = Arrays.asList("income1","income2","hdfsjh","gdvfhjv");
        List<String> resource= Arrays.asList("resource1","resourc2","efgu","hebfehjsbf");
        List<String> expense = Arrays.asList("dghf","aegru","ahfvj","dfvahjdvs");
        nonfin.stream().forEach(s->System.out.println(s));

        List<String>nonf= new ArrayList<>();
        List<String>inc= new ArrayList<>();
        List<String>res= new ArrayList<>();
        List<String>exp= new ArrayList<>();

        Scanner st = new Scanner(System.in);
        String input = st.next();
        System.out.println("Give the input here:"+input);
        if(nonfin.contains(input)){
            nonf.add("pdadded");
            System.out.println(nonf);
        }
        else if(income.contains(input)){
            inc.add("incoem2added");
        }
        else if(resource.contains(input)){
            res.add("resourceadded");
        }
        else{
            exp.add("expenseadded");
        }

    }
}
