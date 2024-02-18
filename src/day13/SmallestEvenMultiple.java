package day13;


// 2413. Smallest Even Multiple
public class SmallestEvenMultiple {
	public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        }
        return n * 2;
    }
	
}
