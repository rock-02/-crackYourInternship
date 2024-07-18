import java.util.HashMap;
import java.util.Map;

public class subarraysumK {

    public static void main(String[] args) {

        int a[] = { 23, 2, 4, 6, 7 };
        int k = 6;
        int l = 0;
        Map<Integer, Integer> s = new HashMap<>();
        s.put(0, -1);
        int sum = 0;
        for (int i = 0; i < a.length; i++) {

            sum += a[i];

            if (s.containsKey(sum - k)) {
                System.out.println("true");
                l = Math.max(i - s.get(sum - k), l);
            }
            s.put(sum, i);
        }

        System.out.println(l);
    }
}
