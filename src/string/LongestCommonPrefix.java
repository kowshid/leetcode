// Problem: 14
// https://leetcode.com/problems/longest-common-prefix/

package string;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        int inputStringsCount = strs.length;
        int longestCommonPrefixLength;

        if (inputStringsCount <= 1) {
            return strs[0];
        }

        longestCommonPrefixLength = strs[0].length();

        for (int i = 0; i < inputStringsCount - 1; i++) {

            int len = Math.min(strs[i].length(), strs[i + 1].length());

            for (int j = 0; j < len; j++) {

                if (strs[i].charAt(j) != strs[i + 1].charAt(j)
                        && j < longestCommonPrefixLength) {

                    longestCommonPrefixLength = j;
                    break;
                }
            }

            longestCommonPrefixLength = Math.min(longestCommonPrefixLength, len);

            if (longestCommonPrefixLength == 0) {
                return "";
            }
        }

        return strs[0].substring(0, longestCommonPrefixLength);
    }
}