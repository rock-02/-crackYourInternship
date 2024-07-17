import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class foursum {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
            HashSet<List<Integer>> temp = new HashSet<>();

            for (int i = 0; i < nums.length; i++) {
                long z1 = nums[i];
                long mt1 = (long) target - nums[i];

                for (int j = i + 1; j < nums.length; j++) {
                    long z2 = nums[j];
                    long mt2 = mt1 - nums[j];

                    HashSet<Long> hs = new HashSet<>();

                    for (int k = j + 1; k < nums.length; k++) {
                        if (hs.contains(mt2 - nums[k])) {
                            List<Integer> t = new ArrayList<>();
                            t.add((int) z1);
                            t.add((int) z2);
                            t.add(nums[k]);
                            t.add((int) (mt2 - nums[k]));
                            temp.add(t);
                        }
                        hs.add((long) nums[k]);
                    }
                }
            }

            List<List<Integer>> ans = new ArrayList<>(temp);
            return ans;
        }
}
