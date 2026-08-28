package daily.leetcode75;
// 643. Maximum Average Subarray I - Sliding Window
public class D008FindMaxAverage {

    public double findMaxAverage(int[] nums, int k) {

        int windowSum = 0; // 紀錄目前視窗總和

        
        for (int i = 0; i < k; i++) { // 先計算第一個長度為 k 的視窗總和
            windowSum += nums[i];
        }

        int maxSum = windowSum;
        for (int i = k; i < nums.length; i++) { // 從第 k 個元素開始滑動視窗
            windowSum += nums[i]; // 加入右側新進來的元素
            windowSum -= nums[i - k]; // 扣除左側離開視窗的元素          
            maxSum = Math.max(maxSum, windowSum); // 更新最大總和
        }
        return (double) maxSum / k; // 回傳最大平均值
        
    }

}
