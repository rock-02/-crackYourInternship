import java.util.Stack;

public class removeadjdupli {

    class pair {
        int count;
        char c;

        pair(int c, char ch) {
            this.c = ch;
            this.count = c;
        }

    }

    public String removeDuplicates(String s, int k) {

        Stack<pair> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.size() > 0 && st.peek().c == s.charAt(i)) {
                if (st.peek().count == k - 1) {
                    st.pop();
                } else
                    st.peek().count += 1;
            } else {
                pair p = new pair(1, s.charAt(i));
                st.push(p);
            }
        }

        StringBuilder ans = new StringBuilder();
        while (st.size() > 0) {
            pair p = st.pop();
            for (int i = 0; i < p.count; i++) {
                ans.insert(0, p.c);
            }
        }
        return ans.toString();
    }
}
