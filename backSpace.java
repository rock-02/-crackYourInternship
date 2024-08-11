/**
 * backSpace
 */
public class backSpace {

    public boolean backspaceCompare(String s, String t) {

        Stack<Character> s1 = new Stack<>();
        Stack<Character> t1 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '#') {
                if (s1.size() == 0) {
                    continue;
                } else {
                    s1.pop();
                }
            } else {
                s1.push(c);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if (c == '#') {
                if (t1.size() == 0) {
                    continue;
                } else {
                    t1.pop();
                }
            } else {
                t1.push(c);
            }
        }

        if (s1.size() != t1.size())
            return false;

        while (s1.size() > 0 && t1.size() > 0) {
            if (s1.pop() != t1.pop())
                return false;
        }

        return true;
    }
}