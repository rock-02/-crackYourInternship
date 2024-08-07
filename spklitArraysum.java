public class spklitArraysum {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int mx = Integer.MIN_VALUE;
        int sum = 0;

        for (int x : nums) {
            mx = Math.max(x, mx);
            sum += x;
        }
        if (k == n) {
            return mx;
        }

        int l = mx;

        int h = sum;
        int ans = 0;

        while (l <= h) {
            int ml = (l + h) / 2;

            int c = 1;
            int s = 0;

            for (int i : nums) {
                s += i;
                if (s > ml) {
                    c++;
                    s = i;
                }
            }

            if (c <= k) {
                ans = ml;
                h = ml - 1;
            } else {
                l = ml + 1;
            }
        }
        ;

        return ans;
    }
}
