import java.util.Arrays;

public class FindPeakElement {

    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;

        int mid = nums[(l + r) / 2];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.abs(mid - nums[i]);
        }

        return sum;
    }

    public static void main(String[] args) {

        int nums[] = { 1, 8, 4, 5 };

        Arrays.sort(nums);

        int s = findPeakElement(nums);

        System.out.println(s);
    }
}
