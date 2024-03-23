package daily.day32;

public class HalvesAreAlike {

	public static void main(String[] args) {
		String s1 = "book";
		String s2 = "textbook";
		System.out.println(halvesAreAlike(s1));
		System.out.println(halvesAreAlike(s2));
	}
	
	public static boolean halvesAreAlike(String s) {
        int half = s.length() / 2;
        int leftCount = 0;
        int rightCount = 0;
        int temp1, temp2;
        
        s = s.toLowerCase();
        for (int i = 0; i < half; i++) {
        	temp1 = s.charAt(i);
        	temp2 = s.charAt(half + i);
        	
        	if (temp1 == 'a' || temp1 == 'e' || temp1 == 'i' || temp1 == 'o' || temp1 == 'u') {
        		leftCount++;
        	}
        	
        	if (temp2 == 'a' || temp2 == 'e' || temp2 == 'i' || temp2 == 'o' || temp2 == 'u') {
        		rightCount++;
        	}
        }
        
        if (leftCount == rightCount) {
        	return true;
        }
        return false;
    }

}
