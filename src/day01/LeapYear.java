package day01;

import java.util.Scanner;

// 是否為閏年？
public class LeapYear {

	public static void main(String[] args) {
		System.out.print("請輸入西元年：");
		int year;
		Scanner scanner = new Scanner(System.in);
		
		try {
            year = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            return; // 如果輸入錯誤，直接結束程式
        } finally {
            scanner.close(); // 確保關閉Scanner
        }
		
		if (year % 4 == 0) {
		    if(year % 100 == 0) {
		        if(year % 400 == 0) {
		            System.out.println(year + "是閏年");
		        } else {
		           System.out.println(year + "不是閏年"); 
		        }
		    } else {
		        System.out.println(year + "是閏年");
		    }
		} else {
		    System.out.println(year + "不是閏年");
		}
	}

}
