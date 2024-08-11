import java.util.HashMap;
import java.util.Stack;

/**
 * nextGreaterElement
 */
public class nextGreaterElement {

    public int[] nextGreaterElement1(int[] nums1, int[] nums2) {

        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; i--) {

            while (s.size() > 0 && s.peek() < nums2[i]) {
                s.pop();
            }

            if (s.size() == 0) {
                hm.put(nums2[i], -1);
            } else {
                hm.put(nums2[i], s.peek());
            }

            s.push(nums2[i]);
        }

        int a[] = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            a[i] = hm.get(nums1[i]);
        }

        return a;
    }
}