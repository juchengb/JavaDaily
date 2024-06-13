package daily.day50;

import java.util.Arrays;

// 2037. Minimum Number of Moves to Seat Everyone
public class MinMoves {
	public int minMovesToSeat(int[] seats, int[] students) {
        int count = 0;

        Arrays.sort(seats);
        Arrays.sort(students);

        for (int i = 0; i < seats.length; i++)
        count += Math.abs(seats[i] - students[i]);

        return count;
    }
}
