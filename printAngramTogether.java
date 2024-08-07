import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class printAngramTogether {
    public List<List<String>> Anagrams(String[] string_list) {
        Map<String, List<String>> m = new HashMap<>();

        for (String s : string_list) {
            char charArray[] = s.toCharArray();

            Arrays.sort(charArray);

            String sorted = new String(charArray);

            if (!m.containsKey(sorted)) {
                m.put(sorted, new ArrayList<>());
            }

            m.get(sorted).add(s);
        }

        List<List<String>> ans = new ArrayList<>();

        for (String s : m.keySet()) {
            ans.add(m.get(s));
        }

        return ans;
    }
}
