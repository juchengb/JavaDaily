package daily.leetcode75;
// 151. Reverse Words in a String
public class D016ReverseWords {
    
    public String reverseWords(String s) {
       
        StringBuilder sb = new StringBuilder();

        s = s.trim();
        int i = s.length() - 1;
        
        while (i >= 0) { // 倒著掃描字串
            while (i >= 0 && s.charAt(i) == ' ') { // 跳過尾端空格
                i--;
            }
            int end = i;
            
            while (i >= 0 && s.charAt(i) != ' ') { // 往左找單字開頭
                i--;
            }
            int start = i + 1;
                        
            sb.append(s, start, end + 1); // 取出單字加入結果            
            sb.append(' '); // 後面還有單字才補空格
        }
        return sb.toString().trim();

    }

}
