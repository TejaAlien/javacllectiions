package com.comparator;

import java.util.*;

public class Execution {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int size = st.nextInt();
        List<Student> studentList = new ArrayList<>();
        for(int i=0;i<size;i++){
            int id = st.nextInt();
            String fn = st.next();
            double cgp = st.nextDouble();
            Student student = new Student(id,fn,cgp);
            studentList.add(student);
        }
       // System.out.println(studentList);
        studentList.stream().map(name->name.getfName().toLowerCase()).filter(names->names.startsWith("r")).sorted().forEach(System.out::println);
       Collections.sort(studentList, new Sortbycgpa());

        studentList.stream().distinct().forEach(r-> System.out.println(r));
        for(Student names: studentList){
            System.out.println(names.getfName());
        }

    }
}

class Sortbycgpa implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {

        int comparison = s1.getId()-s2.getId();
        //.compare() method will return 0 if the difference is 0;
        //.compare() method will return -1 if the object1 (s1 in the sense s2.getgpa)is less than object2(s2)
        //.compare() method will return 1 if the object1>object2
        //see the below one for better understanding

//        public static int compare(Object obj1, Object obj2)
//        {

            // Converting the two objects to integer
            // for comparison
        /*    int intObj1 = (int)obj1;
            int intObj2 = (int)obj2;

            // Get the difference
            int difference = intObj1 - intObj2;

            if (difference == 0) {

                // Both are equal
                return 0;
            }
            else if (difference < 0) {

                // obj1 < obj2
                return -1;
            }
            else {

                // obj1 > obj2
                return 1;
            }
        }*/

        if(comparison != 0) { return comparison; }

        comparison = (int) (s1.getCgpa()-s2.getCgpa());
        //.compareTo() it will return 0 if they are equal
        //it will return <0 if the string is less than the other string
        // it will return greater than 0 if the string is greater than other string
        if(comparison != 0) { return comparison; }

        return s1.getfName().compareTo( s2.getfName());
        }



}
