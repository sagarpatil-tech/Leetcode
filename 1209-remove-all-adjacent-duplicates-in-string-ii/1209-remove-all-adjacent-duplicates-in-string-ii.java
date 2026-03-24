import java.util.*;

class Pair {
    char ch;
    int freq;

    Pair(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }
}

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();

        for (char c : s.toCharArray()) {

            if (!st.isEmpty() && st.peek().ch == c) {
                st.peek().freq++;

                if (st.peek().freq == k) {
                    st.pop(); // remove k duplicates
                }
            } else {
                st.push(new Pair(c, 1));
            }
        }

        // build result
        StringBuilder res = new StringBuilder();

        for (Pair p : st) {
            for (int i = 0; i < p.freq; i++) {
                res.append(p.ch);
            }
        }

        return res.toString();
    }
}