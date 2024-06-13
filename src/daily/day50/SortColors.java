package daily.day50;

// 75. Sort Colors
// bubble sort
public class SortColors {
	public void sortColors(int[] nums) {
        int l = nums.length;
        int tmp;
        for (int i = 0 ; i < l - 1 ; i++) {
            boolean flag = false;
            for (int j = 0 ; j < l - 1 - i ; j++) {
                if (nums[j] > nums [j + 1]) {
                    tmp = nums[j];
                    nums[j] = nums [j + 1];
                    nums [j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}
