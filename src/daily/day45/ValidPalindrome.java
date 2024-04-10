package daily.day45;

//NeetCode Blind 75 - Two Pointers
// 125. Valid Palindrome
public class ValidPalindrome {
	
	public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
        	if (Character.isLetter(c) || Character.isDigit(c)) {
        		sb.append(c);
        	}
        }
        String fixedString = sb.toString().toLowerCase();
        int left = 0;
        int right = fixedString.length() - 1;
        while (left < right) {
        	if (fixedString.charAt(left) != fixedString.charAt(right)) {
        		return false;
        	}
        	left++;
        	right--;
        }
        return true;
    }

}
