package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
        int sumOfOddNums=0;
        for(int number : numbers)
        {
            int absnum=Math.abs(number);
            if(absnum%2==1){
                sumOfOddNums += number;
            }
        }
        return sumOfOddNums;
    }
}