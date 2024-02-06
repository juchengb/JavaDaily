package day02;

import java.util.Scanner;

//練習二：寫一個Sequence類別，顯示由1至1000之間的費伯那西數列(Fibonacci Sequence)
//由1、1開始，下一個數字為上兩個數字的和，舉例來說1、1、2、3、5、8、13、21…。
public class Sequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入 MAX_COUNT 數值：");
		int max = sc.nextInt();
		int num1 = 1, num2 = 1, numNext = num1 + num2;
		System.out.print(num1+" "+num2);
		while(numNext < max){
			System.out.print(" "+numNext);
			num1 = num2;
			num2 = numNext;
			numNext = num1 + num2;
		}

	}

}
