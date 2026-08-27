package daily.leetcode75;
// 392. Is Subsequence
public class D007IsSubsequence {

    public boolean isSubsequence(String s, String t) {

        int i = 0, j = 0;
        // 當 s 和 t 都還沒走到結尾時持續比對
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            } 
            j++;
        }
        // 如果 i 已經走完 s，代表 s 的所有字元都按照順序出現在 t 中
        return i == s.length();

    }
    
}
