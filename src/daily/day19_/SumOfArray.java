package daily.day19_;

// 1480. Running Sum of 1d Array
public class SumOfArray {
	
    public int[] runningSum(int[] nums) {
        int temp = 0;
        int l = nums.length;
        int[] ans = new int[l];
        for (int i = 0; i < l; i++){
            ans[i] = temp + nums[i];
            temp = ans[i];
        }
        return ans;
    }
}
