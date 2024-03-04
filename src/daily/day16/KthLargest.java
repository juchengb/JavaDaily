package daily.day16;

import java.util.Arrays;

// 215. Kth Largest Element in an Array
public class KthLargest {

	public static void main(String[] args) {
		int[] nums = {3,2,1,5,6,4};
		int k = 2;
		System.out.println(findKthLargest(nums, k));
	}
	
	public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int l = nums.length;
        return nums[l-k];
    }

}
