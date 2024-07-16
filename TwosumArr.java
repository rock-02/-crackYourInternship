import java.util.HashMap;

public class TwosumArr {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])) {
                int a[] = new int[2];
                a[0] = i;
                a[1] = hm.get(target - nums[i]);
                return a;
            }
            hm.put(nums[i], i);
        }

        return new int[2];

    }
}
