package daily.day27;

import java.util.HashSet;

public class Intersection {
	
	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> intersection = new HashSet<>();
		
		for (Integer num : nums1) {
			set1.add(num);
		}
		
		for (Integer num : nums2) {
			if(set1.contains(num))
				intersection.add(num);
		}
		
		int[] ans = new int[intersection.size()];
		int index = 0;
		for (Integer i : intersection) {
			ans[index] = i;
			index++;
		}
		
		return ans; 
    }

}
