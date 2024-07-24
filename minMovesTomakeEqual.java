import java.util.Arrays;

public class minMovesTomakeEqual {
    
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int mid=nums[nums.length/2];
        int cn=0;

        for(int i:nums){
            cn+=Math.abs(i-mid);
        }

        return cn;
    }
}
