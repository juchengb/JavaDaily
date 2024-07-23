package daily.day61;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 1636. Sort Array by Increasing Frequency
public class FrequencySort {
	public static void main(String[] args) {
		int[] nums = {1,1,2,2,2,3};
		frequencySort(nums);
	}
	
	public static int[] frequencySort(int[] nums) {
		Map<Integer, Integer> freq = new HashMap<>();
		System.out.println("[STEP 1]");
		for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            System.out.println(freq);
        }
		
		System.out.println("[STEP 2]");
		// int 轉成 Integer
		Integer[] numsObj = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsObj[i] = nums[i];
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        
        System.out.println("[STEP 3]");
        Arrays.sort(numsObj, (a, b) -> {
            if (freq.get(a).equals(freq.get(b))) {
            	System.out.print(Integer.compare(b, a) + "* ");
                return Integer.compare(b, a);
            }
            System.out.print(Integer.compare(freq.get(a), freq.get(b))+ " ");
            return Integer.compare(freq.get(a), freq.get(b));
        });
        System.out.println();
        
        System.out.println("[STEP 4]");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsObj[i];
            System.out.print(numsObj[i] + " ");
        }
        return nums;
	}

}
