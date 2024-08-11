import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class agressiveCows {
    public int maxDistance(int[] position, int m) {
        Queue<Integer> q=new LinkedList<>();

        q.
        Arrays.sort(position);
        int max = -100;
        int n = position.length;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, position[i]);
            if (i + 1 < n)
                min = Math.min(min, position[i + 1] - position[i]);
        }

        System.out.println(min + " " + max);

        int low = min;
        int high = max - min;
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            int c = 1;
            int prev = 0;
            for (int i = 1; i < n; i++) {
                if (position[i] - position[prev] >= mid) {
                    c++;
                    prev = i;
                }
            }

            if (c >= m) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return ans;
    }
}
