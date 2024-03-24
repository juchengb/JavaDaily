package daily.day33;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] nums1 = {1, 3, 4, 2, 2};
		int[] nums2 = {3, 1, 3, 4, 2};
		int[] nums3 = {3, 3, 3, 3, 3};
		System.out.println(findDuplicate(nums1));
		System.out.println(findDuplicate(nums2));
		System.out.println(findDuplicate(nums3));
	}
	
	public static int findDuplicate(int[] nums) {
	    Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
        	if (nums[i] == nums[i+1]) {
        		return nums[i];
        	}
        }
        return 0;
    }

}
