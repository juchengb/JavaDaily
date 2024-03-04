package daily.day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 讓輸入數字並排序
public class NumberSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("請输入整数，如要结束請輸入-1：");
		
		int num;
        while ((num = sc.nextInt()) != -1) {
            list.add(num);
        }
        
        Collections.sort(list);
        
        for (int number : list) {
            System.out.print(number + " ");
        }
	}

}
