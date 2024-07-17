public class rainWaterTrap {
    public int maxArea(int[] height) {

        int l = 0;
        int r = height.length - 1;
        int max = 0;

        while (l < r) {

            int a = (r - l) * Math.min(height[l], height[r]);
            System.out.println(a);
            max = Math.max(a, max);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return max;
    }
}
