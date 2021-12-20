package com.datastructures;

import java.util.*;

public class Stacksolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String s;
        while (in.hasNextLine()) {
            s = in.nextLine();
            int flag = 1, i = 0, l = s.length();
            Stack st = new Stack();
            for (i = 0; i < l; i++) {
                char ch = s.charAt(i);
                if (ch == '(' || ch == '[' || ch == '{')
                    st.push(ch);
                else {
                    if (st.empty()) {
                        flag = 0;
                        break;
                    } else {
                        char c = (char) st.pop();
                        if ((c == '(' && ch != ')') || (c == '[' && ch != ']') || (c == '{' && ch != '}')) {
                            flag = 0;
                            break;
                        }
                    }
                }
            }
            if (flag == 1 && st.empty()) System.out.println("true");
            else System.out.println("false");
        }
    }
}