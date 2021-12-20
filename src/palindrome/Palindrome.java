package palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {

      //  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
     //   String read = bf.readLine();
      StringBuffer original = new StringBuffer(new BufferedReader(new InputStreamReader(System.in)).readLine());
      String str = original.toString();
        StringBuffer reverse = original.reverse();
String re = reverse.toString();

    if(str.equals((re))){
       System.out.println("palindrome");
    }
    else{
        System.out.println("not a palindrome");
    }

    }
}
