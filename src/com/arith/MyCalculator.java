package com.arith;

class MyCalculator implements AdvancedArithmetic{


    @Override
    public int divisor_sum(int number) {
        {
            int sum = 0;

            for(int i = 1; i <= number / 2; i++)
                if(number % i == 0)
                    sum = sum+i;

            return sum + number;
    }
}}

