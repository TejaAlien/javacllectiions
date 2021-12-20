package com.comparatormedium;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<Person> personlist = new ArrayList<>();
        Scanner st = new Scanner(System.in);
        int numberofpersonobjs = st.nextInt();
        for(int i=0;i<numberofpersonobjs;i++){
            String names = st.next();
            int scores = st.nextInt();
            personlist.add(new Person(names,scores));

        }
        Collections.sort(personlist,new Scores());
        for(Person p:personlist){
            System.out.println(p);
        }
    }
   static class Scores implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            int comparision =  o2.getScore()-o1.getScore();
            if(comparision!=0){
                return comparision;
            }

comparision = o1.getName().compareTo(o2.getName());

        return comparision;
    }
}}
