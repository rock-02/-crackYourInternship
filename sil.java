import java.util.Arrays;

public class sil {
    String longComm(String ans, String t) {
        if (ans.length() == 0)
            return t;
        int i = 0;
        int j = 0;
        StringBuilder s = new StringBuilder();
        while (i < ans.length() && j < t.length()) {

            if (ans.charAt(i) == t.charAt(j)) {
                s.append(ans.charAt(i));
                i++;
                j++;
            } else {
                break;
            }
        }
        return s.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String s1 = strs[0];

        String s2 = strs[strs.length - 1];

        return longComm(s1, s2);

    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        sil s = new sil();

        String[] strs = { "flower", "flow", "flight" };

        System.out.println(s.longestCommonPrefix(strs));

    }
}
