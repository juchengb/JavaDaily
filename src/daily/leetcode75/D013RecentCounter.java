package daily.leetcode75;

import java.util.LinkedList;
import java.util.Queue;

// *** 933. Number of Recent Calls - Queue
public class D013RecentCounter {

    // t 會嚴格遞增，Queue 裡的時間也是由小到大排列
    Queue<Integer> queue = new LinkedList<>();
    public D013RecentCounter() {}

    public int ping(int t) {
        queue.offer(t); // 將這次的時間 t 加入 Queue

        // 移除所有「不在 [t - 3000, t] 範圍內」的舊時間
        while (queue.peek() < t-3000) {
            queue.poll();
        }
    
        // Queue 裡剩下的元素就是最近 3000 毫秒內的所有 ping 次數
        return queue.size(); 
    }

}
