package daily.day03;

import java.util.Scanner;

// 輸入兩個數字並求出最大公因數
public class GreatestCommonFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入第一個數字：");
		int num1 = sc.nextInt();
		System.out.print("請輸入第二個數字：");
		int num2 = sc.nextInt();
		int max = Math.max(num1, num2);
		
		for (int i = max; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.print("最大公因數為 " + i);
                break;
            }
        }

	}

}
