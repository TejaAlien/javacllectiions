package com.hashmap.Userdefined;

import java.util.*;

public class HashMapUserdefined {
    public static void main(String[] args) {
        Map<Integer,Student> students = new HashMap<>();

        students.put(4,new Student("Mouli",23,490));
        students.put(6,new Student("Mouli",23,490));
        students.put(2,new Student("suni",67,533));
        students.put(3,new Student("Latha",12,515));
        students.put(1,new Student("Ravi",28,483));
        students.put(5,new Student("Annarao",45,460));
        System.out.println(students);
        Map<Integer,Student> map = new TreeMap<>(students);
        System.out.println(map);
        students.remove(2);
        System.out.println("Using For Each:");
        students.forEach((k,v)->{System.out.println("Key :"+k);System.out.println("Value :"+v);});
        //Using keyset to get the set of keys
 Set<Integer> key=students.keySet();
 for(Integer k:key){
     System.out.println(k);
 }
 //Using values to get the set of values
        Collection<Student> value = students.values();
 for (Student s: value){
     System.out.println(s);
 }
 //Using for Each
        //entryset contains set of entries of key , value
        //get the key, value by entry
        System.out.println("Using forEach:");
      for( Map.Entry<Integer,Student> entry :students.entrySet())

 {
          System.out.println(entry.getKey()+ " "+ entry.getValue());
      }
      System.out.println("Using Iterator:");
   Set<Map.Entry<Integer,Student>> entries  = students.entrySet();
        Iterator<Map.Entry<Integer,Student>> itr = entries.iterator();
        while(itr.hasNext()){
            Map.Entry<Integer,Student> entry = itr.next();
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
        System.out.println(students);
        Boolean iskeypresent = students.containsKey(1);
        System.out.println("If Key present :true or else false "+ "result:"+  iskeypresent);
    Integer size =   students.size();


System.out.println("Size of the elements :"+size);
//Collections.sort(students ,new SortbyMarks());
        for( Map.Entry<Integer,Student> entry :students.entrySet())

        {
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
List<Map.Entry<Integer,Student>> entryList = new LinkedList<>(students.entrySet());
        Collections.sort(entryList, new SortbyMarks());
System.out.println("After sorting:");
for(Map.Entry<Integer, Student> entr : entryList){
   // entryList.add(entr);
    System.out.println(entr.getKey()+ " "+ entr.getValue());
        }
    }

}
class SortbyMarks implements Comparator<Map.Entry<Integer,Student>>{


    @Override
    public int compare(Map.Entry<Integer, Student> o1, Map.Entry<Integer, Student> o2) {
        return o2.getKey() - o1.getKey();
    }
}
//keyNote : remove(key) to remove that element