package day06;

import java.util.Scanner;

/*
 * 求階乘
 * 已知:負數不可以有階乘,0的階乘結果是1, 5!=54321
 */
public class Factorial {

	public static void main(String[] args) {
		System.out.print("請輸入一個正整數：");
        int num = new Scanner(System.in).nextInt();
        
        long ans = 1;
        for (int i = 1; i <= num ; i++) {
        	ans *= i;
         }
        System.out.printf("%d 的階乘為 %d", num, ans);

	}

}
