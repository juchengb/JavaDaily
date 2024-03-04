package daily.day10;

// 1512. Number of Good Pairs
public class GoodPairs {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,1,1,3};
		int[] nums2 = {1,1,1,1};
		int[] nums3 = {1,2,3};
		
		System.out.println(numIdenticalPairs(nums1));
		System.out.println(numIdenticalPairs(nums2));
		System.out.println(numIdenticalPairs(nums3));

	}
	
	public static int numIdenticalPairs(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
        	for (int j = i; j < nums.length; j++) {
        		if (nums[i] == nums[j] && i < j) {
        			count += 1;
        		}
        	}
        }
        
        return count;
    }

}
