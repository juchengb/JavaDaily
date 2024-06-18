package daily.day53;

// 1768. Merge Strings Alternately
public class MergeString {

	public String mergeAlternately(String word1, String word2) {
		StringBuilder ans = new StringBuilder();
		int i = 0;
		int l1 = word1.length();
		int l2 = word2.length();
		int maxL = Math.max(l1, l2);
		while (i < maxL) {
			if (i < l1)
				ans.append(word1.charAt(i));
			if (i < l2)
				ans.append(word2.charAt(i));
			i++;
		}
		return ans.toString();
	}

}
