package daily.leetcode75;
// 238. Product of Array Except Self
// Without division
// Prefix Product + Suffix Product
public class D017ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1; // 左側空集合的乘積
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1]; // 左側前綴乘積
        }

        int rightProduct = 1; // 右側空集合的乘積
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= rightProduct; // 將右側乘積乘進答案
            rightProduct *= nums[i]; // 更新右側乘積供下一個位置使用
        }
        
        return ans;

    }

}
