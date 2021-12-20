package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {
    public static void main(String[] args) {
        Pattern  pattern = Pattern.compile(".yy.");
        // first . represents starting index and last . represents end index
        //matched can have any start and end index but has yy in the middle to match with the pattern
       /*String ch = pattern.toString();
       char[] i = ch.toCharArray();
       for(char y:i){
           System.out.println(y);
       }*/
        Matcher matcher = pattern.matcher("ayyr");
        System.out.println(matcher.matches()+matcher.group());
    }
}
