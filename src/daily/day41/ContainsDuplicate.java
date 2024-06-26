package daily.day41;

import java.util.HashSet;
import java.util.Set;

// NeetCode Blind 75 - Arrays & Hashing
// 217. Contains Duplicate
public class ContainsDuplicate {
	
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> numsSet = new HashSet<>();
		for (int i: nums) {
			if (numsSet.contains(i)) {
				return true;
			}
			numsSet.add(i);
		}
		return false;
    }
}
