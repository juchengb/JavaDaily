package daily.day14;

// 1688. Count of Matches in Tournament
public class NumberOfMatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int numberOfMatches1(int n) {
        return n-1;
    }
	
	public int numberOfMatches2(int n) {
        int count = 0;
        while (n != 1) {
        	count += n / 2;
        	if (n % 2 == 0) {
        		n /= 2;
            } else {
            	n = n / 2 + 1;
            }
        }
        return count;
    }
	

}
