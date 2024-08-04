package daily.day64;

import java.util.ArrayList;
import java.util.Collections;


public class RangeSum {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		int n = 4, left = 1, right = 5;
		rangeSum(nums, n, left, right);
	}
	public static int rangeSum(int[] nums, int n, int left, int right) {
		ArrayList<Integer> store = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += nums[j];
				store.add(sum);
			}
		}
		Collections.sort(store);
		System.out.println(store);
		int resultSum = 0, mod = (int) 1e9 + 7;
		for (int k = left - 1; k < right; k++) {
			System.out.println(store.get(k));
			resultSum = (resultSum += store.get(k)) % mod;
		}
		System.out.println("resultSum: " + resultSum);
		return resultSum;
	}
}
