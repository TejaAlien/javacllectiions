package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sampleregex {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
String input =st.next();
        Pattern pattern = Pattern.compile("[Hello welcome to My programming]+");

        Matcher matcher = pattern.matcher(input);
if (matcher.find()){
    System.out.println("Found the text: "+matcher.group()+": Starting index:"+matcher.start()+" Ending Index: "+matcher.end());
}
else{
    System.out.println("Not found");
}
    }
}
