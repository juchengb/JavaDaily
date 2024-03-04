package daily.day17;

// 2894. Divisible and Non-divisible Sums Difference
public class SumsDifference {

	public static void main(String[] args) {
		int n = 10;
		int m = 3;
		differenceOfSums(n, m);
	}
	
	public static int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;
        int i = 1;
        while (i <= n){
            if (i % m == 0) {
            	System.out.println("num2 += " + i);
                num2 += i;
            } else {
                num1 += i;
                System.out.println("num1 += " + i);
            }
            i++;
        }
        System.out.println(num1 + " - " + num2);
        return num1 - num2;
    }

}
