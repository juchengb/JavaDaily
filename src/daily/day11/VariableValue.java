package daily.day11;

// 2011. Final Value of Variable After Performing Operations
public class VariableValue {
	
	public int finalValueAfterOperations(String[] operations) {
	    int result = 0;

	    for (String op : operations) {
	    	if (op.charAt(1) == '+') {
	    		result +=1;
	    	} else if (op.charAt(1) == '-') {
	    		result -=1;
	    	}
	    }
	    	
	    return result;
	  }

}
