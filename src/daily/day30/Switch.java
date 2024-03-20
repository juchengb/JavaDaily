package daily.day30;

public class Switch {

	public static void main(String[] args) {
		int wd = 0;
		String days[] = {"sun", "mon", "wed", "sat"};
		for (String s: days) {
			switch (s) {
				case "sat":
					System.out.println("經過 sat,wd = " + wd);
				case "sun":
					wd -= 1;
					System.out.println("經過 sun, wd -= 1,wd = " + wd);
					break;
				case "mon":
					wd++;
					System.out.println("經過 mon, wd++, wd = " + wd);
				case "wed":
					wd += 2;
					System.out.println("經過 wed, wd += 2, wd = " + wd);
			}
		}
		System.out.println(wd);
				
	}

}
