package com.tel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book b = new MyBook();
        Scanner st = new Scanner(System.in);
        String title = st.next();
        b.setTitle(title);
        System.out.println(b.getTitle());
        st.close();
    }
}
