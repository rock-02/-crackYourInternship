import java.util.HashMap;
import java.util.Map;

public class subarraysumdivk {

    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();

        int s = 0;
        int c = 0;
        m.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
            int r = s % k;
            System.out.println(c);
            if (r < 0)
                r += k;

            System.out.println(c);

            if (m.containsKey(r)) {
                System.out.println(c);
                c += m.get(r);
            }
            System.out.println(c);

            m.put(r, m.getOrDefault(r, 0) + 1);
        }

        System.out.println(c);

        return c;

    }
}
