package com.sortedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortMain {
    public static void main (String[] a){
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(2,"Ravi","civil",30000));
        emp.add(new Employee(1,"suni","ECE",80000));
        emp.add(new Employee(3,"mouli","metallurgy",45000));
        emp.add(new Employee(4,"NDP","CSE",70000));
        emp.add(new Employee(2,"Ravi","civil",30000));
Collections.sort(emp, new SortbySalry());
System.out.println("Sorting based on salary:");
emp.stream().forEach(employee -> System.out.println(employee));
System.out.println("Using filter :");
emp.stream().filter(dep->dep.getDept()!="civil").forEach(l->System.out
        .println(l));
System.out.println(emp);

    }

    static class SortbySalry implements Comparator<Employee>{


        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o1.getSalary()- o2.getSalary()); // for ascending order
           // return (int) -(o1.getSalary()-o2.getSalary()); // for decending order
        }
    }
}
