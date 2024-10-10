package daily.day65;

// 2678. Number of Senior Citizens
public class CountSeniors {
	
	public static void main(String[] args) {
		String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
		countSeniors(details);
	}
	
	public static int countSeniors(String[] details) {
		int count = 0;
		for(String s : details) {
			String a = s.substring(11, 13);
			if (Integer.parseInt(a) > 60) {
				count += 1;
			}
		}
		return count;
	}

}
