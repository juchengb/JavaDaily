package daily.qhashsetmap;

import java.util.HashSet;
import java.util.Set;

// 217. Contains Duplicate
public class Q0217ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> seen = new HashSet<>(); // 檢查唯一 → HashSet
        for (int n : nums) {
            if (!seen.add(n)) { // 加入成功 (原本不存在) → true；加入失敗 (已存在) → false
                return true;
            }
        }
        return false;

    }

}
