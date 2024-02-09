package day05;

import java.util.Scanner;

/*
 * 測量 BMI
 * BMI 指數測試 BMI = 體重 (kg) / 身高² (m)
 * 過輕：低於18.5
 * 正常：18.5 ~ 22.9
 * 偏胖：23 ~ 24.9
 * 肥胖：25 ~ 29.9
 * 重度肥胖：高於30
 * 極度肥胖：高於40
 */
public class BMI {

	public static void main(String[] args) {
		System.out.print("請輸入身高(單位為m)：");
        double height = new Scanner(System.in).nextDouble();
        System.out.print("請輸入體重(單位為kg)：");
        double weight = new Scanner(System.in).nextDouble();
        
        double bmi = weight / Math.pow(height, 2);
        
        if (bmi < 18.5) {
        	System.out.printf("你的 BMI 為：%.2f (過輕)", bmi);
        } else if (bmi <= 22.9) {
        	System.out.printf("你的 BMI 為：%.2f (正常)", bmi);
        } else if (bmi <= 24.9) {
        	System.out.printf("你的 BMI 為：%.2f (偏胖)", bmi);
        } else if (bmi <= 30) {
        	System.out.printf("你的 BMI 為：%.2f (肥胖)", bmi);
        } else if (bmi <= 40) {
        	System.out.printf("你的 BMI 為：%.2f (重度肥胖)", bmi);
        } else {
        	System.out.printf("你的 BMI 為：%.2f (極度肥胖)", bmi);
        }
	}

}
