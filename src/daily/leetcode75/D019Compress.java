package daily.leetcode75;
// 443. String Compression
// *** in-place
public class D019Compress {

    public int compress(char[] chars) {
        
        int write = 0; // write：寫入結果的位置
        int read = 0; // read：掃描原始陣列

        while (read < chars.length) {
            
            char current = chars[read]; // 記錄目前群組字元
            int start = read; // 群組起點

            // 找出整段連續相同字元
            while (read < chars.length && chars[read] == current) {
                read++;
            }
            int count = read - start; // 計算群組長度

            chars[write++] = current; // 寫入字元本身

            if (count > 1) { // 次數 > 1 才寫入數字
                String cnt = String.valueOf(count); // int 轉 String               
                for (char c : cnt.toCharArray()) { // 逐位寫入
                    chars[write++] = c;
                }
            }
        }
        
        return write;

    }

}
