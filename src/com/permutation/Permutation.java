/*
package com.permutation;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
//Scanner st = new Scanner(System.in);

takinginput("ABC");
    }
    static void takinginput(String input){
        System.out.println("Permutation of string:"+input);
        takinginput("",input);
    }
  private  static void takinginput(String permutation,String input){
        if(input.length()==0){
            System.out.println(permutation);
        }
        else{
            for(int i =0; i<input.length();i++){
                takinginput(permutation+input.charAt(i),input.substring(i)+input.substring(0,i)
                +input.substring(i+1,input.length()));
            }
        }

    }
}
*/
package com.permutation;
import java.util.*;

class Permutation{

    static void permute(String s , String answer)
    {
        if (s.length() == 0)
        {
            System.out.print(answer + " ");
            return;
        }

        for(int i = 0 ;i < s.length(); i++)
        {
            char ch = s.charAt(i);
            String left_substr = s.substring(0, i);
            String right_substr = s.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch);
        }
    }

    // Driver code
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        String s;
        String answer="";

        System.out.print("Enter the string : ");
        s = scan.next();

        System.out.print("\nAll possible strings are : ");
        permute(s, answer);
    }
}

// This code is contributed by adityapande88







