import java.util.Stack;

public class nextTemperature {

    int[] helper(int a[], int n) {

        int ng[] = new int[n];

        Stack<Integer> s = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (s.size() > 0 && a[s.peek()] <= a[i])
                s.pop();

            if (s.size() == 0) {
                ng[i] = 0;
            } else {
                ng[i] = s.peek() - i;
            }

            s.push(i);
        }

        return ng;
    }

    public int[] dailyTemperatures(int[] temperatures) {

        int ans[] = helper(temperatures, temperatures.length);

        return ans;
    }
}
