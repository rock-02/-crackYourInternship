import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class thrresum {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        HashSet<List<Integer>> temp = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            int z = nums[i];
            int mt = 0 - z;
            HashSet<Integer> s = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {

                if (s.contains(mt - nums[j])) {
                    List<Integer> sl = new ArrayList<>();
                    int z1 = (mt - nums[j]);
                    int z2 = nums[j];
                    sl.add(z);
                    sl.add(z1);
                    sl.add(z2);
                    temp.add(sl);
                }
                s.add(nums[j]);
            }
        }

        List<List<Integer>> listOfLists = new ArrayList<>(temp);

        return listOfLists;
    }
}
