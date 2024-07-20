package daily.day59;

// 1605. Find Valid Matrix Given Row and Column Sums
public class RestoreMatrix {
	public static void main(String[] args) {
		int[] rowSum = {3,8}, colSum = {4,7};
		int[][] result = restoreMatrix(rowSum, colSum);
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println("");
		}
	}
    public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n = rowSum.length, m = colSum.length;
        
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < m; j++) {
        		result[i][j] = Math.min(rowSum[i], colSum[j]);
        		rowSum[i] -= result[i][j];
        		colSum[j] -= result[i][j];
        	}
        }
        return result;
    }
}
