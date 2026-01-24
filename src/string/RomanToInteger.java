// Problem: 13
// https://leetcode.com/problems/roman-to-integer/description/
package string;

import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {

        Map<Character, Integer> romanNumeralValueMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int len = s.length();
        char[] chars = s.toCharArray();

        int value = romanNumeralValueMap.get(chars[len - 1]);

        if (len == 1) {
            return value;
        }

        int currentValue, prevValue;

        for (int i = len - 2; i >= 0; i--) {
            currentValue = romanNumeralValueMap.get(chars[i]);
            prevValue = romanNumeralValueMap.get(chars[i + 1]);

            if (prevValue > currentValue) {
                value -= currentValue;
            } else {
                value += currentValue;
            }
        }

        return value;
    }
}
