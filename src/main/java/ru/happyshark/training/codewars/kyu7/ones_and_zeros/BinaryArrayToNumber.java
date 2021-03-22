package ru.happyshark.training.codewars.kyu7.ones_and_zeros;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BinaryArrayToNumber {

//    https://www.codewars.com/kata/578553c3a1b8d5c40300037c
//
//    Given an array of ones and zeroes, convert the equivalent binary value to an integer.
//
//    Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
//
//    Examples:
//
//    Testing: [0, 0, 0, 1] ==> 1
//    Testing: [0, 0, 1, 0] ==> 2
//    Testing: [0, 1, 0, 1] ==> 5
//    Testing: [1, 0, 0, 1] ==> 9
//    Testing: [0, 0, 1, 0] ==> 2
//    Testing: [0, 1, 1, 0] ==> 6
//    Testing: [1, 1, 1, 1] ==> 15
//    Testing: [1, 0, 1, 1] ==> 11
//    However, the arrays can have varying lengths, not just limited to 4.

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int result = 0;
        for (int i = 0; i < binary.size(); i++) {
            result += binary.get(i) * (int) Math.pow(2, binary.size() - i - 1);
        }
        return result;
    }

    public static int anotherSolution(List<Integer> binary) {
        return binary.stream().reduce((x, y) -> x * 2 + y).get();
    }
}
