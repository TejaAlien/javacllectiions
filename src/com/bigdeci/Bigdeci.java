package com.bigdeci;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;

public class Bigdeci {
// BigDecimal is used in banking and other sectors for giving the precise value(by using string )
// and it has multiplication substraction methods campareto methods to compare the objects
   // Bigdecimal extends Number and implements comparable interface


    public static void main(String[] args) {
        float d1 = 10.40f;
        float d2 =  10.32f;
        System.out.println("with double and float we are not getting precise value"+ (d1-d2));
        BigDecimal bigDecimal = new BigDecimal("10.40");
        BigDecimal bigDecimal2 = new BigDecimal("10.32");
        System.out.println((bigDecimal).subtract(bigDecimal2));
        BigDecimal scaling = new BigDecimal("23.4");
        // Scaling in the sense how many digits you want after decimal point
        String convert= String.valueOf(scaling.setScale(7, RoundingMode.HALF_UP));
        System.out.println(convert);
        System.out.println(scaling);
        BigDecimal input1 = new BigDecimal("2.34");
        BigDecimal input2 = new BigDecimal("34.56");
        System.out.println(String.valueOf(input1.multiply(input2)));


    }
}
