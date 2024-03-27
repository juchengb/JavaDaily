package daily.day35;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Game1A2B {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("歡迎來到數字遊戲");
		String ans;
		String result;
		String pc = generateRandom();
		
		do {
			ans = input();
			
			while (!isValidInput(ans)) {
				System.out.println("輸入格式錯誤，請重新輸入四個不重複的數字");
                ans = input();
			}
			result = judge(ans, pc);
			System.out.println(ans + " " + result);
		} while (!result.equals("4A0B"));
		System.out.print("恭喜過關！");
	}
	
	public static String generateRandom() {
	    StringBuilder pc = new StringBuilder();
	    boolean[] used = new boolean[10];

	    while (pc.length() < 4) {
	        int digit = (int) (Math.random() * 10);
	        if (!used[digit]) {
	            pc.append(digit);
	            used[digit] = true;
	        }
	    }

	    return pc.toString();
	}
	
	public static String input() {
		System.out.print("請輸入 4 個 0 ~ 9 數字(數字不得重複)：");
		return sc.next();
	} 
	
	public static boolean isValidInput(String input) {
        if (input.length() != 4)
            return false;

        Set<Character> set = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (c < '0' || c > '9')
                return false;
            set.add(c);
        }
        return set.size() == 4;
    }
	
	
	public static String judge(String ans, String pc) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < 4; i++) {
			if (pc.charAt(i) == ans.charAt(i)) {
				a++;
			}
			for (int j = 0; j < 4; j++) {
				if (pc.charAt(i) == ans.charAt(j) && i != j) {
					b++;
				}
			}
		}
		return a + "A" + b + "B";
	}
}
