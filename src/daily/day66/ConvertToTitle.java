package daily.day66;

// 168. Excel Sheet Column Title
public class ConvertToTitle {
	
	public static void main(String[] args) {
		int i = 701;
		System.out.println(convertToTitleint(i));
	}
	
	public static String convertToTitleint(int columnNumber) {
		StringBuilder ans = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            ans.append((char) (((columnNumber) % 26) + 'A'));
            columnNumber = (columnNumber) / 26;
        }
        return ans.reverse().toString();
    }
}
