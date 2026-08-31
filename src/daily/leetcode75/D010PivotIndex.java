package daily.leetcode75;
// 724. Find Pivot Index
public class D010PivotIndex {

    public int pivotIndex(int[] nums) {
        
        int total = 0, left = 0;

        for (int num : nums) { // 算全部總和
            total += num;
        } 

        for (int i = 0; i < nums.length; i++) {
            // 如果左邊總和 == 右邊總和 (總和 - 左邊總和 - 當前元素)
            if (left == total - left - nums[i]) {
                return i;
            }

            left += nums[i]; // 將目前元素加入左邊總和
        }
        
        return -1; // 找不到 Pivot Index

    }

}
