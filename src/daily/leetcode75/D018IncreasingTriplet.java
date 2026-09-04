package daily.leetcode75;
// 334. Increasing Triplet Subsequence - Greedy
public class D018IncreasingTriplet {

    public static boolean increasingTriplet(int[] nums) {
        
        if(nums.length < 3) {
            return false;
        }

        // 尚未找到第一個與第二個候選值
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        
        for (int i : nums) {
            if (i <= first) {
                first = i;
            } else if (i <= second) {
                second = i;
            } else {
                return true;
            }
        }
        
        return false;
    
    }

}
