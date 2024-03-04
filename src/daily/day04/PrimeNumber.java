package daily.day04;

import java.util.Scanner;

// 質數
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("輸入正整數:");
		int num = sc.nextInt();
		boolean isPrime = true;
		for(int i = 2 ; i < num ; i++){
			if(num % i == 0){
				isPrime = false;
				break;
			}
		}
		System.out.println(num + (isPrime ? "是質數" : "不是質數"));
		
	}

}
