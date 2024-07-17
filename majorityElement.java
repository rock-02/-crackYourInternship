import java.util.HashMap;

public class majorityElement {
    public int majorityElement1(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        for (Integer x : hm.keySet()) {
            if (hm.get(x) > nums.length / 2)
                return x;
        }

        return -1;
    }
}
