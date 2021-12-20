package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVaalidator {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\w+.\\w+\\W[[GMAIL]]+.\\w+");
        for(int i =0; i<3;i++) {

String  input = st.next();
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()) {
                //System.out.println(matcher.group());
                System.out.println("Email Allowed :" + matcher.group());
            } else {
                System.out.println("Invalid Email not allowed Sorry)..(");
            }
        }
    }
}
