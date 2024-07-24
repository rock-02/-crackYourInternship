import java.util.HashMap;
import java.util.Map;

public class missingPossitive {
    public int firstMissingPositive(int[] nums) {

        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        }
        int i = 1;
        while (true) {
            if (m.containsKey(i))
                i++;
            else
                break;
        }
        return i;
    }
}
