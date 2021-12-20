package com.Bigdecimal;
import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<BigDecimal> list = new ArrayList<>();
        for(int i =0;i<n;i++) {
            list.add(sc.nextBigDecimal());
        }
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());

        System.out.println(list);
      for(BigDecimal  b: list){
String s = b.toPlainString();
if(s.startsWith("0.")){
    s=s.replace("0.",".0");
}
           System.out.println(s);
        }


    }}