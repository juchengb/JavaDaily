package day18_;

// 771. Jewels and Stones
public class JewelsAndStones {
	public int numJewelsInStones(String jewels, String stones) {
        char[] jewelsChar = jewels.toCharArray();
        char[] stonesChar = stones.toCharArray();
        
        int count = 0;
        
        for (int i = 0; i < jewelsChar.length; i++) {
        	for (int j = 0; j < stonesChar.length; j++) {
        		if (jewelsChar[i] == stonesChar[j]) {
        			count ++;
        		}
        	}
        }
        
        return count;
    }
}
