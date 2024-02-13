package day08;

import java.util.Arrays;

// 1929. Concatenation of Array
public class ConcatenationOfArray {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5};
		getConcatenation(nums);
	}
	
    public static int[] getConcatenation(int[] nums) {
        int[] nums2 = Arrays.copyOf(nums, nums.length *2);
        for (int i = 0; i < nums.length; i++) {
        	nums2[i + nums.length] = nums[i];
        }
        
        for (int n: nums2) {
        	System.out.print(n + " ");
        }
        
        return nums2;
    }
	
}
