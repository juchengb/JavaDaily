package daily.day57;

public class PassThePillow {
	public static int passThePillow(int n, int time) {
		 int current = 1;
	     int direction = 1;
	     
	     while (time > 0) {
	    	 if (!(current + direction <= n && current + direction > 0)) {
	    		 direction *= -1;
	    	 }
	    	 current += direction;
	    	 time --;
	    	 System.out.println("currentPosition: " + current + ", time: " + time);
	     }
	     System.out.println("Answer: " + current);
	     return current;
    }
	
	public static void main(String[] args) {
		passThePillow(4, 5);
		System.out.println("");
		passThePillow(3, 2);
	}
}
