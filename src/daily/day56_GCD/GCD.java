package daily.day56_GCD;

//1071. Greatest Common Divisor of Strings
public class GCD {
	public String gcdOfStrings(String str1, String str2) {
		
		if (!(str1 + str2).equals(str2 + str1)) {
	        return "";
	    }
		
		int l1 = str1.length();
		int l2 = str2.length();
		
		// 輾轉相除法計算兩個字串長度的最大公因數。
		int gcdl;
		while (l2 != 0) {
	        int temp = l2;
	        l2 = l1 % l2;
	        l1 = temp;
	    }
		gcdl = l1;
		return str1.substring(0,gcdl);
	}
}
