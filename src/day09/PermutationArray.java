package day09;

// 1920. Build Array from Permutation
public class PermutationArray {

	public static void main(String[] args) {
		int[] nums1 = {0,2,1,5,3,4};
		int[] nums2 = {5,0,1,2,3,4};
		buildArray(nums1);
		buildArray(nums2);
	}
	
	public static int[] buildArray(int[] nums) {
        int l = nums.length;
        int [] nums2 = new int[l];
        for (int i = 0 ; i < nums.length ; i++) {
            nums2 [i] = nums[nums[i]];
            System.out.print(nums2 [i] + ", ");
        }
        System.out.println();
        return nums2;
    }

}
