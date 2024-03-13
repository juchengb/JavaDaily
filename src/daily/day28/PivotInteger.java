package daily.day28;

// 2485. Find the Pivot Integer
public class PivotInteger {

	public static void main(String[] args) {
		System.out.println(pivotInteger(8));
		System.out.println(pivotInteger(1));
		System.out.println(pivotInteger(4));
	}
	
	public static int pivotInteger(int n) {
		for (int i = 1; i <= n; i++) {
			long leftSum = (i + 1) * i / 2;
			long rightSum = (n + i) * (n - i + 1) / 2;
			if (leftSum == rightSum)
				return i;
		}
		return -1;
    }

}
