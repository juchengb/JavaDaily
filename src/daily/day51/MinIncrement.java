package daily.day51;

import java.util.Arrays;


// 945. Minimum Increment to Make Array Unique
public class MinIncrement {
	public int minIncrementForUnique(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i-1]) {
                int add = nums[i - 1] + 1 - nums[i];
                count += add;
                nums[i] = nums[i - 1] + 1;
            }
        }
        return count;
    }
}
