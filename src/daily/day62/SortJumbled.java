package daily.day62;

import java.util.ArrayList;
import java.util.Collections;

public class SortJumbled {
	public static void main(String[] args) {
		int[]mapping = {8,9,4,0,2,1,3,5,7,6}, nums = {991,338,38};
		int[]mapping2 = {0,1,2,3,4,5,6,7,8,9}, nums2 = {789,456,123};
		sortJumbled(mapping2, nums2);
	}
	
	public static int[] sortJumbled(int[] mapping, int[] nums) {
		ArrayList<Integer> store = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			String num = Integer.toString(nums[i]);
			String realNum = "";
			for (int j = 0; j < num.length(); j++) {
				System.out.println(num.charAt(j));
				realNum += Integer.toString(mapping[num.charAt(j) -'0']);
			}
			System.out.println(realNum);
			store.add(Integer.parseInt(realNum));
		}
		Collections.sort(store);
		int[] result = new int[nums.length];
		int c = 0;
		for (Integer num : store) {
			result[c] = num;
			c++;
			System.out.println(num);
		}
		return result;
	}
}
