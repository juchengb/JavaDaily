package daily.day20;

// 258. Add Digits
public class AddDigits {
	public int addDigits(int num) {
         while (num / 10 > 0) { 
             num = (num / 10) + (num % 10);
         }
         return num;
    }
}
