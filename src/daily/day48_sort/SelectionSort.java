package daily.day48_sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {10, 40, 30, 60, 50, 20};
		selectionSort(arr);
	}
	
	public static  int[] selectionSort(int[] arr) {
		System.out.println("Original: " + Arrays.toString(arr));
		int l = arr.length;
		for (int i = 0; i < l - 1; i++) {
			System.out.print("round" + (i + 1) + ": ");
			int minIdx = i;
			for (int j = i + 1; j < l; j++) {
				if (arr[minIdx] > arr[j]) {
					minIdx = j;
				}
			}
			if(minIdx != i) {
				int tmp = arr[minIdx];
				arr[minIdx] = arr[i];
				arr[i] = tmp;
				System.out.println(Arrays.toString(arr));
			}
		}
		System.out.println("Answer: " + Arrays.toString(arr));
		return arr;
	}
}
