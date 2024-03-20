package daily.day30;

// 1662. Check If Two String Arrays are Equivalent
public class ArrayStringsAreEqual {
	
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String i: word1) {
            sb1.append(i);
        }
        
        for(String j: word2) {
        	sb2.append(j);
        }
        
        if (sb1.toString().equals(sb2.toString())) {
        	return true;
        }
        return false;
    }

}
