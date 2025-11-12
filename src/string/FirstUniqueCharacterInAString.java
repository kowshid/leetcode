// Problem: 387
// https://leetcode.com/problems/first-unique-character-in-a-string/

package string;

import java.util.HashSet;

public class FirstUniqueCharacterInAString {
    public int firstUniqueChar(String s) {
        if (s.length() == 1) return 0;
        HashSet<Character> occurredChar = new HashSet<>();
        for (int i = 0; i < s.length() - 1; i++) {
            Character ch = s.charAt(i);
            if (occurredChar.contains(ch)) continue;
            occurredChar.add(ch);

            boolean notUniq = false;
            for (int j = i + 1; j < s.length(); j++) {
                if (ch.equals(s.charAt(j))) {
                    notUniq = true;
                    break;
                }
            }

            if (!notUniq) {
                return i;
            }
        }

        if (!occurredChar.contains(s.charAt(s.length() - 1)))
            return s.length() - 1;

        return -1;
    }
}