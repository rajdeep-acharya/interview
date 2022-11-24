import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestNew {
/*  Given a string s, find the length of the longest substring without repeating characters.
    Example 1:

    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.

    Example 2:

    Input: s = "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.

    Example 3:

    Input: s = "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.

    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

    Constraints:
    0 <= s.length <= 5 * 104
    s consists of English letters, digits, symbols and spaces.*/

    public static int lengthOfLongestSubstring(String s) {
        char[] charArr = s.toCharArray();
        int len = charArr.length;
        if(len < 2) {
            return len;
        }
        Map<String, Integer> map = new HashMap<>();
        int localMax;
        int globalMax = 0;
        for (int i=0; i < len; i++) {
            if (!map.containsKey(String.valueOf(charArr[i]))) {
                map.put(String.valueOf(charArr[i]), i);
                globalMax = map.size();
            } else {
                localMax = map.size();
                if (localMax > globalMax) {
                    globalMax = localMax;
                }
                map.clear();
                map.put(String.valueOf(charArr[i]), i);
            }
        }
        return globalMax;
    }

    public static void main(String[] s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Input String: \n -----------");
        String str = scanner.next();
        System.out.println(lengthOfLongestSubstring(str));
    }

}
