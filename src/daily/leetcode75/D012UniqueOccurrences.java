package daily.leetcode75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 1207. Unique Number of Occurrences
// 統計次數 → HashMap | 檢查唯一 → HashSet
public class D012UniqueOccurrences {

    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> freq = new HashMap<>(); // 統計每個數字出現次數
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            // 等於 ↓
            // int count = freq.getOrDefault(num, 0);
            // count++;
            // freq.put(num, count);
        }

        Set<Integer> seen = new HashSet<>(); // 記錄已出現過的次數
        for (int count : freq.values()) {
            if (!seen.add(count)) { // 加入成功 (原本不存在) → true；加入失敗 (已存在) → false
                return false;
            }
        }

        return true;
        
    }

}
