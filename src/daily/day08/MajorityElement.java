package daily.day08;

import java.util.HashMap;
import java.util.Map;

// 169. Majority Element
public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = {3, 4, 4, 2, 4, 4, 2, 4};
		System.out.println(majorityElement(nums));
	}
	
	public static int majorityElement(int[] nums) {
	      
        Map<Integer, Integer> isMap = new HashMap<Integer, Integer>();
        int ret=0;
        
        for (int num: nums) {

            if (!isMap.containsKey(num)) // 如果沒找到指定的 key
                isMap.put(num, 1); // (key:value) 添加進 map
            else
                isMap.put(num, isMap.get(num)+1); // 找到指定的 key 的 value 後 +1

            if (isMap.get(num)>nums.length/2) { // 如果當下的 key 的 value 大於陣列長度的一半
                ret = num;
                break;
            }
        }
        return ret;
    }

}
