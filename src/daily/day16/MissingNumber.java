package daily.day16;

// 268. Missing Number
public class MissingNumber {

	public static void main(String[] args) {
		int[] nums = {3,0,1};
		missingNumber(nums);
	}
	
	public static int missingNumber(int[] nums) {
        int sum = 0;
		int l = nums.length;
		for (int i : nums) {
			sum += i;
			System.out.println(i);
		}
        return ((1 + l) * l / 2) - sum;
    }

}
