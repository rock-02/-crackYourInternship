import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class allDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        List<Integer>ld=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                ld.add(nums[i]);
            }
            hs.add(nums[i]);
        }

        return ld;
}
}
