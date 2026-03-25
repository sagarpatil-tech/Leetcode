import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(String op : operations) {

            if(op.equals("C")) {
                st.pop();

            } else if(op.equals("D")) {
                st.push(st.peek() * 2);

            } else if(op.equals("+")) {
                int top1 = st.pop();
                int top2 = st.peek();

                int sum = top1 + top2;

                st.push(top1);   // restore
                st.push(sum);

            } else {
                st.push(Integer.parseInt(op));
            }
        }

        int res = 0;
        for(int num : st) {
            res += num;
        }

        return res;
    }
}