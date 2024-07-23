public class productOfArrayExceptItself {
    public int[] productExceptSelf(int[] nums) {

        int product = 1;

        int p[] = new int[nums.length];

        for (int i = 0; i < nums.length - 1; i++) {
            product *= nums[i];
            p[i] = product;
        }

        int bp = 1;
        for (int i = nums.length - 1; i >= 1; i--) {
            p[i] = bp * p[i - 1];
            bp *= nums[i];
        }

        p[0] = bp;

        return p;

    }
}
