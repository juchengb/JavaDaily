package daily.day48_sort;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {10, 40, 30, 60, 50, 20};
		insertionSort(arr);
	}
	
	public static int[] insertionSort(int[] arr) {
		int l = arr.length;
		for (int i = 1; i < l; i++) {
			System.out.println("round " + i);
			int insertVal = arr[i];
			System.out.println("insert value = " +  insertVal);
			int idx = i - 1; // 即 arr[i] 前面這個數的索引
			
			// 1.確保 idx 不越界
			// 2.insertVal < arr[idx] 待插入的數還沒找到插入位置
			// 將大於 insertVal 的元素向後移動一位
			while (idx >= 0 && insertVal < arr[idx]) {
				arr[idx + 1] = arr[idx];
				System.out.println("index = " + idx + ", move " + Arrays.toString(arr));
				idx--;
			}
			arr[idx + 1] = insertVal;
			System.out.println(Arrays.toString(arr));

		}
		return arr;
	}
}
