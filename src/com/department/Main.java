package com.department;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
Department d = new Department(1,"Annatha");
Department d2 = new Department(2, "Flore");
List<Department> ls = new ArrayList<>();
ls.add(d);
ls.add(d2);
System.out.println(ls);

    }
}
class Department {
  int id;
  String name;


    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}