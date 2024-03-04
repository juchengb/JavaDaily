package daily.day07;

import java.util.Scanner;

/*
 * 預測子女身高
 * （父親身高＋母親身高＋13）÷2＝男生成年後的身高（±5公分）
 * （父親身高＋母親身高－13）÷2＝女生成年後的身高（±5公分）
 * 
 */
public class PredictHeight {

	public static void main(String[] args) {
		System.out.print("請輸入父親身高(cm)：");
        double fatherHeight = new Scanner(System.in).nextDouble();
        System.out.print("請輸入母親身高(cm)：");
        double motherHeight = new Scanner(System.in).nextDouble();
        
        double boy = (fatherHeight + motherHeight + 13 ) / 2;
        double girl = (fatherHeight + motherHeight - 13 ) / 2;
        
        System.out.printf("兒子成年後的身高為 %.1f ~ %.1f /n女兒成年後的身高為 %.1f ~ %.1f", boy-5, boy+5, girl-5, girl+5);

	}

}
