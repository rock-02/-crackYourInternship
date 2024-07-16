public class moveZeroes {
    public void moveZeroes1(int[] nums) {

        // int z = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            } else {
                nums[c] = nums[i];
                c++;
            }
        }

        for (int i = c; i < nums.length; i++) {
            nums[i] = 0;
        }

    }
}