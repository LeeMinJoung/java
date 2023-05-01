package re03;

public class SwitchEx01 {
	public static void main(String[] args) {
		int a = 10;
		switch(a) {
			case 50:
				System.out.println("50");
			case 30:
				System.out.println("30");
			case 10:
				System.out.println("10");
		}
		
		int num = 6;
		switch(num) {
			case 1:
				System.out.println(1);
			case 2:
				System.out.println(2);
			case 3:
				System.out.println(3);
			default:
				System.out.println(0);
			case 4:
				System.out.println(4);
		}
	}
}
