package daily.leetcode75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 2215. Find the Difference of Two Arrays
public class D011FindDifference {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }

        // 找出兩個 Set 的共同元素，並從兩邊移除
        for(int num : nums1){
            if(set2.contains(num)){
                set1.remove(num);
                set2.remove(num);
            }
        }
        
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>(set1));
        answer.add(new ArrayList<>(set2));
        return answer;

    }

}
