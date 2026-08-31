package daily.qhashsetmap;

import java.util.HashMap;
import java.util.Map;

// 242. Valid Anagram - 非最佳解，練習 HashMap 使用
public class Q0242IsAnagram {

    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) { // 檢查長度是否相同
            return false;
        }

        // 統計次數 → HashMap
        // Key: 字元 | Value: 出現次數
        Map<Character, Integer> map = new HashMap<>(); 
        
        // 統計 s 的字元頻率
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 扣除 t 的字元頻率
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) { // 若字元不存在，代表 t 有額外字元
                return false;
            }

            map.put(c, map.get(c) - 1); // 若字元存在，次數減 -1

            if (map.get(c) == 0) { // 次數減到 0 可以直接移除
                map.remove(c);
            }
        }

        return map.isEmpty(); // 若全部抵消完成，Map 應為空
        
    }

}
