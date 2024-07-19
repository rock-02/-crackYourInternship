public class JumpGame {

    public boolean canJump(int[] nums) {
        int mj = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i > mj) {
                return false;
            }
            mj = Math.max(mj, i + nums[i]);
        }

        if (mj >= nums.length - 1)
            return true;

        return false;

    }

}
