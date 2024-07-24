import java.util.Arrays;

public class maxProdut {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int i = nums.length - 1;
        int c = 0;
        int p = 1;
        while (c < 3) {
            p *= nums[i];
            i--;
            c++;
        }

        int p2 = 1;
        for (i = 0; i < 2; i++)
            p2 *= nums[i];

        p2 *= nums[nums.length - 1];

        return Math.max(p, p2);
    }
}
