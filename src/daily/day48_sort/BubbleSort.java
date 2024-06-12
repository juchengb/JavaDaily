package daily.day48_sort;

import java.util.Arrays;

public class BubbleSort {

		public static void main(String[] args) {
			int[] arr = {10, 40, 30, 60, 50, 20};
			bubbleSort(arr);
		}
		
		public static int[] bubbleSort(int [] arr) {
			System.out.println("Original: " + Arrays.toString(arr));
		    int temp = 0;
		    int length = arr.length;
		    for (int i = 0; i < length - 1; i++) {
		        boolean flag = false;
		        for (int j = 0; j < length - 1 - i; j++) {
		            if (arr[j] > arr[j+1]) {
		                temp = arr[j];
		                arr[j] = arr[j+1];
		                arr[j+1] = temp;
		                flag = true;
		                System.out.println(Arrays.toString(arr));
		            }
		        }
		        System.out.println("== " + Arrays.toString(arr));
		        if (!flag) {
		        	System.out.println("break: " + Arrays.toString(arr));
		            break;
		        }
		    }
		    System.out.println("Answer: " + Arrays.toString(arr));
		    return arr;
		}
}
