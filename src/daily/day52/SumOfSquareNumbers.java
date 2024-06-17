package daily.day52;

// 633. Sum of Square Numbers
public class SumOfSquareNumbers {
	public boolean judgeSquareSum(int c) {
        for (int a = 1; a * a <= c; a++) {
            for (int b = 1; b * b <= c; b++) {
                if (a * a + b * b == c)
                    return true;
            }
        }
        return false;
    }
}
