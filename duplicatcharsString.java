/**
 * duplicatcharsString
 */
public class duplicatcharsString {

    public static void main(String[] args) {

        String s = "geeksforgeeks";

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] > 1) {
                // System.out.print(s.charAt(i));
                freq[s.charAt(i) - 'a'] = 0;
                res += s.charAt(i);
            }
        }

        System.out.println(res);
    }
}
