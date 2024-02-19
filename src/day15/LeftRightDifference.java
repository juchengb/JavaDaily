package day15;

import java.util.Arrays;

// 2574. Left and Right Sum Differences
public class LeftRightDifference {

	public static void main(String[] args) {
		int[] nums = {10,4,8,3};
		leftRightDifference(nums);
	}
	
	public static int[] leftRightDifference(int[] nums) {
        int l = nums.length;
        int[] leftSum = new int[l];
        int[] rightSum = new int[l];
        int[] answer = new int[l];
        int left = 0; 
        int right = Arrays.stream(nums).sum();
        for (int i = 0; i < l; i ++) {
            if (i == 0) {
                leftSum[i] = left;
            } else {
                 leftSum[i] = left += nums[i-1];
            }
            rightSum[i] = right -= nums[i];
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
            System.out.println("left = " + leftSum[i] + "; right = " + rightSum[i]);
        }   
        return answer;
    }

}
