import java.util.ArrayList;
import java.util.List;

public class countSmallernumberAfterItself {

    class Pair {
        int val;
        int idx;

        Pair(int v, int i) {
            val = v;
            idx = i;
        }
    }

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        Pair[] pairs = new Pair[n];
        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(nums[i], i);
        }

        int[] counts = new int[n];
        mergeSort(pairs, 0, n - 1, counts);

        List<Integer> result = new ArrayList<>();
        for (int count : counts) {
            result.add(count);
        }
        return result;
    }

    private void mergeSort(Pair[] pairs, int left, int right, int[] counts) {
        if (left >= right)
            return;

        int mid = left + (right - left) / 2;
        mergeSort(pairs, left, mid, counts);
        mergeSort(pairs, mid + 1, right, counts);

        merge(pairs, left, mid, right, counts);
    }

    private void merge(Pair[] pairs, int left, int mid, int right, int[] counts) {
        int n = right - left + 1;
        Pair[] sorted = new Pair[n];
        int i = left;
        int j = mid + 1;
        int k = 0;
        int rightCounter = 0;

        while (i <= mid && j <= right) {
            if (pairs[i].val > pairs[j].val) {
                sorted[k++] = pairs[j++];
                rightCounter++;
            } else {
                counts[pairs[i].idx] += rightCounter;
                sorted[k++] = pairs[i++];
            }
        }

        while (i <= mid) {
            counts[pairs[i].idx] += rightCounter;
            sorted[k++] = pairs[i++];
        }

        while (j <= right) {
            sorted[k++] = pairs[j++];
        }

        for (int l = 0; l < n; l++) {
            pairs[left + l] = sorted[l];
        }
    }
}
