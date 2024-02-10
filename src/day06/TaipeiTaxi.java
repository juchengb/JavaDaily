package day06;

import java.util.Scanner;

/*
 * 
 * (1)計程運價：起程1.25公里85元，續程每200公尺5元。
 * (2)延滯計時運價：車速每小時5公里以下，累計每60秒5元（日間）。
 */
public class TaipeiTaxi {

	public static void main(String[] args) {
		System.out.print("請輸入總運行公里數：");
        int distance = new Scanner(System.in).nextInt();
        
        int cost;
        if (distance > 1.25) {
        	System.out.print("請輸入總延滯秒數：");
            int time = new Scanner(System.in).nextInt();
        	cost = 85 + (int)((distance - 1.25) * 25) + (time * 5 / 60);
        } else {
        	cost = 85;
        }
        
        System.out.println("本次車資為：NT$ 1" + cost);

	}

}
