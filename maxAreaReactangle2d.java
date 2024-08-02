import java.util.Stack;

public class maxAreaReactangle2d {
    public int largestRectangleArea(int[] heights) {

        int lb[] = new int[heights.length];
        Stack<Integer> ls = new Stack<>();
        lb[0] = -1;
        ls.push(0);
        int n = heights.length;
        for (int i = 1; i < n; i++) {

            while (ls.size() > 0 && heights[ls.peek()] >= heights[i]) {
                ls.pop();
            }
            if (ls.size() == 0) {
                lb[i] = -1;
            } else {
                lb[i] = ls.peek();
            }
            ls.push(i);

        }

        int rb[] = new int[heights.length];
        ls = new Stack<>();
        rb[n - 1] = n;
        ls.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {

            while (ls.size() > 0 && heights[ls.peek()] >= heights[i]) {
                ls.pop();
            }
            if (ls.size() == 0) {
                rb[i] = n;
            } else {
                rb[i] = ls.peek();
            }

            ls.push(i);
        }

        int area = 0;

        for (int i = 0; i < n; i++) {

            int w = rb[i] - lb[i] - 1;

            area = Math.max(w * heights[i], area);
        }

        return area;
    }

    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int[] cur = new int[matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++) {
            cur[j] = matrix[0][j] == '1' ? 1 : 0;
        }

        int n = matrix.length;
        int maxA = largestRectangleArea(cur);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    cur[j]++;
                } else {
                    cur[j] = 0;
                }
            }
            maxA = Math.max(maxA, largestRectangleArea(cur));
        }

        return maxA;

    }
}
