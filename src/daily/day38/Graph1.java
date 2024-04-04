package daily.day38;

import java.util.Scanner;

/*
 * 圖形印製【第一題】
 * 設計一程式，輸入n，印出以下內容(以下以n=5 舉例):
 *     1
 *    212
 *   32123
 *  4321234
 * 543212345
 * 
 */
public class Graph1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("請輸入整數n:");
		int n = input.nextInt();
		
		for (int i = 1; i < n; i++) { // 換行
			for (int j = n - 1; j >= i; j--) { // 空格
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) { // 數字
				System.out.print(k);
			}
			while (i >= 2) {
				for (int l = 2; l <= i; l++) { // 數字
					System.out.print(l);
				}
				break;
			}
			System.out.println("");
		}
		
		

	}

}
