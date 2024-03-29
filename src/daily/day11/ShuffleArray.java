package daily.day11;

// 1470. Shuffle the Array
public class ShuffleArray {
	
	public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        for(int i=0;i<2*n;i++) {
        	result[i] = (i % 2 == 0) ? nums[i/2] : nums[n+i/2];
        } 
            
        return result;
    }

}
