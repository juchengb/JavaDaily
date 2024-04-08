package daily.day43;


// 1700. Number of Students Unable to Eat Lunch
public class StudentsUnableToEatLunch {

	public int countStudents(int[] students, int[] sandwiches) {
		int zeros = 0;
		int ones = 0;
		int l = sandwiches.length;
		
		for (int s : students) {
			if (s == 0) {
				zeros++;
			} else {
				ones++;
			}
		}
		
		for (int i = 0; i < l; i++) {
			if (sandwiches[i] == 0 && zeros > 0) {
				zeros--;
			} else if (sandwiches[i] == 1 && ones > 0) {
				ones--;
			} else {
				return l - i;
			}
		}
		return 0;
	}
}
