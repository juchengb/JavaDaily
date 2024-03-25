package daily.day34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 442. Find All Duplicates in an Array
public class FindDuplicates {
	
	public List<Integer> findDuplicates(int[] nums) {
		Arrays.sort(nums);
		List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
        	if (nums[i] == nums[i+1]) {
        		ans.add(nums[i]);
        	}
        }
        return ans;
	 }

}
