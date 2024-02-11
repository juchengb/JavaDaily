package day07;

import java.util.Scanner;

//輸入兩個數字並求出最小公倍數
public class LeastCommonMultiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入第一個數字：");
		int num1 = sc.nextInt();
		System.out.print("請輸入第二個數字：");
		int num2 = sc.nextInt();
		int max = Math.max(num1, num2);
		int greatestCommonFactor = 0;
		
		for (int i = max; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
            	greatestCommonFactor = i;
                break;
            }
        }
		
		int ans = num1 * num2 / greatestCommonFactor;
		
		System.out.println("最小公倍數為 " + ans);

	}

}
