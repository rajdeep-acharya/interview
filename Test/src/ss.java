/*
public class ss {
    // you can also use imports, for example:
import java.util.*;

    // you can write to stdout for debugging purposes, e.g.
    // System.out.println("this is a debug message");

    class Solution {
        public int solution(String S) {
            // write your code in Java SE 8
            int count_B = 1;
            int count_A = 3;
            int count_N = 2;
            char[] c = S.toCharArray();
            int maxCountForB = countForStr('B', c);
            int maxCountForA = countForStr('A', c);
            int maxCountForN = countForStr('N', c);
            int maxPossibleForB = findMaxPossiblePerCharacter(maxCountForB, count_B);
            int maxPossibleForA = findMaxPossiblePerCharacter(maxCountForA, count_A);
            int maxPossibleForN = findMaxPossiblePerCharacter(maxCountForN, count_N);
            return Math.min(Math.min(maxPossibleForB, maxPossibleForA), maxPossibleForN);
        }

        private int countForStr(char s, char[] c) {
            int count = 0;
            for (int i=0; i < c.length; i++) {
                if (s == c[i]) {
                    count++;
                }
            }
            return count;
        }

        private int findMaxPossiblePerCharacter(int count, int count_char) {
            return count/count_char;
        }
    }

}


// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        if(N==0) {
            return 1;
        }
        TreeSet<Integer> ts = new TreeSet<Integer>();
        for (int i = 0; i < N - 1 ; i++) {
            for (int j = 0; j < N - 1 - i ; j++) {
                ts.add((2^i)*(3^j));
            }
        }
        return ts.last();
    }
}
*/
