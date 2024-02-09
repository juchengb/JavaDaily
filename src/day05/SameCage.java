package day05;

/*
 * 雞兔同籠 (窮舉法)
 * 已知雞兔共有 35 隻,共 94 隻腳，請問雞和兔各幾隻？
 */
public class SameCage {

	public static void main(String[] args) {
		for(int chicken = 0, rabbit = 35; chicken <= 35; chicken++, rabbit--) {
            if(chicken * 2 + rabbit * 4 == 94) {
                System.out.printf("雞有 %d 隻，兔有 %d 隻", chicken, rabbit);
            }
        }

	}

}
