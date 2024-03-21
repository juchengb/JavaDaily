package daily.day31;

import java.util.Arrays;

// 977. Squares of a Sorted Array
public class SortedSquares {

	public static void main(String[] args) {
		int[] nums1 = {-4, -1, 0, 3, 10};
		int[] nums2 = {-7, -3, 2, 3, 11};
		
		nums1 = sortedSquares(nums1);
		nums2 = sortedSquares(nums2);
		for(int i : nums1) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i : nums2) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] sortedSquares(int[] nums) {
		int l = nums.length;
		int[] ans = new int[l];
        for (int i = 0; i < l; i++) {
        	ans[i] = nums[i] * nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }

}
