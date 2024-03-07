package daily.day24;

import java.util.ArrayList;
import java.util.List;

// 1389. Create Target Array in the Given Order
public class CreateTargetArray {

	public static void main(String[] args) {
		int[] nums = {0, 1, 2, 3, 4};
		int[] index = {0, 1, 2, 2, 1};
		createTargetArray(nums, index);
	}
	
	public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length ; i++){
            list.add(index[i], nums[i]);
            System.out.println(list);
        }
        
        for(int i = 0; i < nums.length ; i++){
            result[i] = list.get(i);
            System.out.println(result[i]);
        }
        return result;
    }

}
