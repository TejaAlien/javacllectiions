package com.basic;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("Ravi");
        int id = user.getId();
        System.out.println(id);

        System.out.println(user.getName());
    }
}
