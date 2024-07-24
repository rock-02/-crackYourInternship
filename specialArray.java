public class specialArray {
    public int specialArr(int[] nums) {
        int n = nums.length;
        int f[] = new int[n + 1];

        for (int x : nums) {
            f[Math.min(n, x)]++;
        }

        int c = 0;
        for (int i = n; i >= 1; i--) {
            c += f[i];
            if (c == i)
                return i;
        }

        return -1;

    }
}
