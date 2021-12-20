package regex;

import java.util.regex.Pattern;

public class RegexmetaCharacters {
    char ch = '\'';

    public static void main(String[] args) {
        //. can be any character from 0-255 (like numbers , alphabets, specialcharacters)
        System.out.println(Pattern.matches(".","}"));
        //below //d checks whether the input is digit or not
        System.out.println(Pattern.matches("\\d","1"));
        //below//D checks whether the input is non-digit or not like except numbers ,all characters
System.out.println(Pattern.matches("\\D+","}}}}"));
System.out.println(Pattern.matches("\\s[a-z]?"," a"));
System.out.println(Pattern.matches("[a-z]+\\s[a-z]+\\s[Nanda]+","ravi teja Nanda"));
//[a-z]-->only any of them [a-z]+ checks all
        System.out.println("checks omly one character without+"+Pattern.matches("[a-z]","a"));
        System.out.println("checks all from a to z with + "+Pattern.matches("[a-z]+","ravi"));
System.out.println(Pattern.matches("[a-z]+\\S[a-z]+\\S[a-z]+","ravitejananda"));
        System.out.println("we will get error because of spacing requested:"
                +Pattern.matches("[a-z]+\\s[a-z]+\\s[Nanda]+","ravitejaNanda"));
        System.out.println("Spacing given so no error: "
                +Pattern.matches("[a-z]+\\s[a-z]+\\s[Nanda]+","ravi teja Nanda"));
System.out.println("Any letters or numbers:"+Pattern.matches("\\w+","we0ere"));
       /* The RegExp \\W Metacharacter in JavaScript is used to find the non word character i.e.
                characters which are not from a to z,
        A to Z, 0 to 9. It is same as [^a-zA-Z0-9].*/
System.out.println("Non letters and numbers  "+Pattern.matches("\\W{4}","{{{{{"));
System.out.println("Repeseents a word boundary"+Pattern.matches("\\b[foo]+\\b","foo"));
System.out.println("Represents a non-word boundary"+Pattern.matches("\\B[}{}]+\\B","}{}"));
System.out.println("phonenumber starts with 8 or 9 and has total 10 digits: "
        +Pattern.matches("[8 9][0-9]{9}","7885553392"));
System.out.println("first one uppercase , small alpahbets and digit in between " +
        ""+Pattern.matches("[A-Z][a-z]+[0-9][a-z]+","Aaba1aba"));
    }
}
