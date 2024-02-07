package day03;

import java.util.Scanner;

/*
 * 使用者輸入金額，
 * 將此金額以100元、50元、10元、5元、1元六種貨幣組合出該金額。
 * 組合方式為依照面額由大至小的順序使用貨幣，且每種貨幣的數量為無限多，
 * 無法使用100元時才能使用50元，無法使用50元時才可以使用10元，依此類推。
 * 由螢幕輸出計算結果。輸出格式為五個數字，第一個數字代表用幾個100元、第二個數字表示用幾個50元，依此類推。
 * 例如: 輸入101，輸出: 1 0 0 0 1。
 */
public class Change {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入金額：");
		int amount = sc.nextInt();
		
		int a = amount / 100 ;
		int b = ( amount - a * 100 ) / 50;
		int c = ( amount - a * 100 - b * 50) / 10;
		int d = ( amount - a * 100 - b * 50 - c * 10 ) / 5;
		int e = ( amount - a * 100 - b * 50 - c * 10 - d * 5 );
		
		System.out.printf("%d %d %d %d %d", a, b, c, d, e);
		
	}
}
