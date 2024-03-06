package daily.day23;

// 9. Palindrome Number
public class Palindrome {

	public static void main(String[] args) {
		int a = 121;
		int b = -121;
		int c = 10;
		System.out.println(isPalindrome(a));
		System.out.println(isPalindrome(b));
		System.out.println(isPalindrome(c));

	}
	
	public static boolean isPalindrome(int x) {
		String s = String.valueOf(x);
		int l = s.length();
		
		for (int i = 0; i < l / 2; i++) {
			if (s.charAt(i) != s.charAt(l - i - 1))
				return false;
		} 
		return true;
    }
}
