package daily.day02;

import java.util.Scanner;

/*
 * 撰寫一個程式讀入一個介於100 - 999的數字，並顯示它的每位數和、積和差。
 * 如：932 的每位數和是14、每位數積是54、每位數差是4。(百位數減十位數再減個位數)
 */
public class Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入一個介於 100 ~ 999 的數字：");
		int num = sc.nextInt();
		
		int hundreds = num / 100;
		int tens = (num - hundreds * 100) /10 ;
		int digits = num % 10;
		
		System.out.println(hundreds +", " + tens + ", " + digits);
		System.out.println("和：" + (int)(hundreds + tens + digits));
		System.out.println("積：" + (int)(hundreds * tens * digits));
		System.out.println("差：" + (int)(hundreds - tens - digits));

	}

}
