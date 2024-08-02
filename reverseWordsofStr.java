import java.util.Stack;

public class reverseWordsofStr {
    public String reverseWords(String s) {

        Stack<String> st = new Stack<>();

        StringBuilder t = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                if (t.length() > 0) {
                    st.push(t.toString());
                    t = new StringBuilder("");
                }

            } else {
                t.append(s.charAt(i));
            }
        }

        if (t.length() > 0) {
            st.push(t.toString());
            t = new StringBuilder("");
        }

        String ans = "";
        while (st.size() > 1) {
            ans += (st.pop() + " ");

        }

        ans += st.pop();

        return ans;
    }

}