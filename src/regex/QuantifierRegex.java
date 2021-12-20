package regex;

import java.util.regex.Pattern;

public class QuantifierRegex {
    public static void main(String[] args) {
        System.out.println("? quantifier checks it occurs once or not at all");
        System.out.println("checking either a or b or c not ab or bc or abc together returns false: "+Pattern.matches("[abc]","ab"));
        System.out.println("returns false because a occurs more than 1 time: "+Pattern.matches("[abc]?", "aaaa"));
        System.out.println("returns true it occurs only once: "+Pattern.matches("[abc]?","a"));
        System.out.println("+quantifier and *quantifier or same almost ->checking a,b and c :checks it occurs more than or equal to  one time ");
        System.out.println(Pattern.matches("[abc]+","a"));
        System.out.println("a occurs more than one time : so true when you use +quantifier :"+Pattern.matches("[abc]+","aa"));
        System.out.println("checking a,b,and c -->here d is also present so false :"+Pattern.matches("[abc]+","aaabcd"));
        System.out.println("* quantifier checks wheather a,b and c occurs more number of times or one time :"+Pattern.matches("[abc]*","abccc"));
        System.out.println("{n} quantifier checks how many times a character is present ");
        System.out.println("if more or less than n times returns false :"+Pattern.matches("[abc]{4}","aaaa"));
        System.out.println("{n,m} char occurs atleast n times but less than m times ");
        System.out.println(Pattern.matches("[abc]{4,7}","aaaaa"));
        System.out.println("{n,} char occurs atleast n times and more ");
        System.out.println(Pattern.matches("[abc]{3,}","aaaa"));
        System.out.println(Pattern.matches("\\d","d"));
    }
}
