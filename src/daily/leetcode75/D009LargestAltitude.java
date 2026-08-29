package daily.leetcode75;
// 1732. Find the Highest Altitude
public class D009LargestAltitude {

    public int largestAltitude(int[] gain) {

        int current = 0, max = 0;

        for (int i : gain) {
            current += i;
            max = Math.max(current, max);
        }
        return max;
        
    }

}