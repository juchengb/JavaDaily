package daily.day22;

// 1750. Minimum Length of String After Deleting Similar Ends
public class MinimumLength {
	
	public static int minimumLength(String s) {
		int start = 0;
	    int end = s.length() - 1;
        while (end > start && s.charAt(end) == s.charAt(start)) {
            char c = s.charAt(end);

            while (end >= start && s.charAt(start) == c) 
                start ++;
            while (end > start && s.charAt(end) == c)
                end --;
        }
        return end - start + 1;
    }

}
