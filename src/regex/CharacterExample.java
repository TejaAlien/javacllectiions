package regex;

import java.io.PrintStream;
import java.util.regex.Pattern;

public class CharacterExample {
    public static void main(String[] args) {
        // here we are passing regex and the input string
        /*Params:
        regex – The expression to be compiled
        input – The character sequence to be matched*/
        System.out.println("checks a so true:"+Pattern.matches("[abc]","a"));
        System.out.println("^ except a,b, or c so true:"+Pattern.matches("[^abc]","d"));
        System.out.println("checks 0-9 so true:"+Pattern.matches("[0-9]","9"));
        System.out.println("checks only one character either a or b or c not ab, bc , ca ,abc so false :"+Pattern.matches("[abc]","ab"));
        System.out.println("a-zorA-z checks only one character "+Pattern.matches("[a-zA-Z]","AAbbdes"));
        //[abc]? checks only one character either a or b or c not ab, bc , ca ,abc
        //[abc]+ checks a, b,and c, any of them present whether one time or n times occurs then print true or else false if not a,b,c present
        //[a-zA-Z] checks a-zorA-z checks only one character input has multiple characters  so false
        //if you use + for the above then returns true because it checks a-z and A-Z all characters
        System.out.println("+checks all characters more than or equal to one :"+Pattern.matches("[a-zA-Z]+","AAbbdes"));
        System.out.println("a to d or m to p union ?one +allcharacterscheck");
        System.out.println(Pattern.matches("[a-d[m-p]]+","mnabc"));
        System.out.println(Pattern.matches("[a-d[m-p]]?","mnabc"));
        System.out.println(Pattern.matches("[a-z&&[^a-c]]+","da"));// not a to c remaining
        System.out.println(Pattern.matches("[a-z&&[bgf]]?","b"));//from a-z check b or g or f present
        System.out.println(Pattern.matches("[a-z&&[gyt]]+","ggyyttgy"));// from a-z check g,y and t
    }
}
