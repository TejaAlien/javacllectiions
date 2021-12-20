package solution;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
Scanner st = new Scanner(System.in);
String input = st.next();
Map<Character,Integer> map  = new HashMap<>();
     //   String str = "abs";
        // abs,asb,bsa,bas,sab,sba
char[] ch = input.toCharArray();
for(int i=0;i<input.length();i++){
    System.out.println(ch[i]);

}
    for(Character c :ch){
        map.put(c,1);
    }
    System.out.println(map);

    }
}
