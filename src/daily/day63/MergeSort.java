package daily.day63;

import java.util.Arrays;

// 912. Sort an Array (merge sort)
public class MergeSort {
	
	public static void main(String[] args) {
		 int[] arr = {64, 34, 25, 12, 22, 11, 90};
		 int [] ans = sortArray(arr);
	     System.out.println(Arrays.toString(ans));
	}
	
	public static int[] sortArray(int[] nums) {
		if (nums == null || nums.length <= 1) {
            return nums;
        }
		int mid = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);

        sortArray(left);
        sortArray(right);
        return merge(nums, left, right);
	}
	
	private static int[] merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
        return arr;
	}

}
