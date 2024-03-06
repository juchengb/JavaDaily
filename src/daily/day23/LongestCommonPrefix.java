package daily.day23;

import java.util.Arrays;

// 14. Longest Common Prefix
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs1 = {"flower", "flow", "flight"};
		String[] strs2 = {"dog", "racecar", "car"};
		System.out.println(longestCommonPrefix(strs1));
		System.out.println(longestCommonPrefix(strs2));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		StringBuffer sb = new StringBuffer();
        Arrays.sort(strs);
        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
        	for (String s : strs) {
                if (i < s.length()) {
                    if (s.charAt(i) != first.charAt(i))
            		return sb.toString();
                }	
            }
        	sb.append(first.charAt(i));
        }
        return sb.toString();
    }

}
