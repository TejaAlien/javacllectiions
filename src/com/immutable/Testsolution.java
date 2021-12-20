package com.immutable;

public class Testsolution {
    public static void main(String[] args) {
        Age age = new Age();
        age.setMonth("January");
        age.setDay(15);
        age.setYear(1993);
        Studentimmutable studentimmutable
                = new Studentimmutable("ravi",1,age);
        System.out.println(studentimmutable);
        System.out.println(studentimmutable.getName()+"<--name "+studentimmutable.getId()+"<--id "+studentimmutable.getAge().getDay()+" <--day");
        age.setDay(17);
        System.out.println(studentimmutable.getAge().getDay());
    }
}
