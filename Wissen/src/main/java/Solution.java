import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Solution {

    // remove adjacent duplicate from string
    // "abbccdd" -> "a"
    // "bccb" -> ""
    // "xwxx" -> "xw"
    // "xwxw" -> "xwxw"

    // "a" - 0
    // "b" - 1, 2 -> r
    // "c" - 3, 4

    // "b" - 0, 3
    // "c" - 1, 2 - r

    // "x" - 0
    // "w" - 1

    // 0 - "b"
    // 1 - "c"
    // 2 - "c"
    // 3 - "b"


    public static void main(String[] args) {
        String str = "xwxx";
        char[] charArray = str.toCharArray();
        int j = 0;
        Map<Integer, Character> map = new LinkedHashMap<>();
        for (int i = 0 ; i < charArray.length ; i++ ) {
            if (map.containsValue(charArray[i])) {
//                Set<Integer> set = map.keySet();
                if (map.get(i-1) != null && map.get(i-1).equals(charArray[i])) {
                    map.remove(i-1);
                    j = i;
                } else {
                    j = i - j;
                    if (j == 1) {
                        map.remove(i-3);
                    }
                }
            } else {
                map.put(i, charArray[i]);
            }
        }
        System.out.println(map.values());
    }

/*    class Solution {
        public String removeDuplicates(String s) {
            Stack<Character> st = new Stack<>();
            for(int i = 0; i < s.length() ;i++){
                if(!st.isEmpty()){
                    if(st.peek() == s.charAt(i)){
                        st.pop();
                    }else{
                        st.push(s.charAt(i));
                    }
                }else{
                    st.push(s.charAt(i));
                }
            }
            StringBuilder ns = new StringBuilder("");
            while(!st.isEmpty()){
                ns.append(st.pop());
            }
            return ns.reverse().toString();
        }
    }*/

}
