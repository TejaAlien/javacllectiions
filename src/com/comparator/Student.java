package com.comparator;

public class Student {
    private int id;
    private String fName;
    private double cgpa;

    public Student(int id, String fName, double cgpa) {
        this.id = id;
        this.fName = fName;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }

   /* @Override
    public int compareTo(Student o) {
        *//*You are given a list of student information: ID, FirstName, and CGPA.
                Your task is to rearrange them according to their CGPA in decreasing order.
        If two student have the same CGPA, then arrange them according to their first name in alphabetical order.
        If those two students also have the same first name, then order them according to their ID.
        No two students have the same ID.*//*
        if (this.cgpa != o.cgpa) {

            {
                if (this.cgpa > o.cgpa)
                    return -1;
                else
                    return 1;
            }
		else if (this.fName.equals(o.fName)) {
                return
                        Integer.compare(this.id, o.id);
            } else {
                if (this.fName.compareTo(o.fName) < 0)
                    return -1;
                else
                    return 1;

            }
            //return 0;
        }
    }*/
}
