public class sortColors {
    public void sortColors1(int[] nums) {

        int c[] = new int[3];

        for (int i = 0; i < nums.length; i++)
            c[nums[i]]++;

        int j = 0;
        for (int i = 0; i < 3; i++) {

            while (c[i] > 0) {
                nums[j++] = i;
                c[i] -= 1;
            }

        }

    }
}
