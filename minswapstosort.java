import java.util.Arrays;

public class minswapstosort {

    public static class pair implements Comparable<pair> {
        int val;
        int idx;

        pair(int v, int i) {
            val = v;
            idx = i;
        }

        public int compareTo(pair o) {
            return this.val - o.val;
        }
    }

    public int minSwaps(int nums[]) {
        int n = nums.length;
        pair[] p = new pair[n];

        int ans = 0;
        for (int i = 0; i < n; i++) {
            p[i] = new pair(nums[i], i);
        }

        Arrays.sort(p);

        boolean vis[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (vis[i] || p[i].idx == i)
                continue;

            int cycle = 0;
            int j = i;

            while (!vis[j]) {
                vis[j] = true;
                cycle++;
                j = p[j].idx;
            }

            ans += (cycle - 1);
        }

        return ans;
    }
}
