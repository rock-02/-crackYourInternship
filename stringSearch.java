public class stringSearch {
    public int strStr(String haystack, String needle) {
        int i = 0;
        int j = needle.length() - 1;

        if (haystack.length() < needle.length()) {
            return -1;
        }

        while (j < haystack.length()) {
            int l = 0;
            for (int k = i; k <= j; k++) {
                if (needle.charAt(l) == haystack.charAt(k)) {
                    l++;
                } else {
                    break;
                }
            }
            if (l == needle.length())
                return i;
            i++;
            j++;
        }
        return -1;

    }
}
