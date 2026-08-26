// 283. Move Zeroes - Two Pointers
public class D006MoveZeroes {

    public void moveZeroes(int[] nums) {

        int insertPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != insertPos) {
                    int temp = nums[i];
                    nums[i] = nums[insertPos];
                    nums[insertPos] = temp;
                }
                insertPos++;
            }
        }

    }

}
