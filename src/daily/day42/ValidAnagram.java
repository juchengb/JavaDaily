package daily.day42;

import java.util.Arrays;

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        s = new String(sChars);
        t = new String(tChars);


        if (s.equals(t)){
            return true;
        }
        return false;
	}
}