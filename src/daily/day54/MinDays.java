package daily.day54;

import java.util.Arrays;

// wrong answer
public class MinDays {
	public static void main(String[] args) {
		int[] b = {7,7,7,7,12,7,7};
		minDays(b, 2, 3);
	}
	
	public static int minDays(int[] bloomDay, int m, int k) {
        int l = bloomDay.length;
        int goal = m * k;
        System.out.println("length = " + l + ", goal = " + goal);
        if (l >= goal) {
        	Arrays.sort(bloomDay);
        	for (int a : bloomDay) {
        		System.out.print(a + " ");
        	}
        	System.out.println();
        	int count = 0;
        	int i = 0;
			while (goal > 0 && i < l) {
        		count = bloomDay[i];
        		i++;
        		goal --;
        		System.out.printf("count = %d, i = %d, goal = %d%n", count, i, goal);
			}
			return count;
        }
        return -1;
    }
}
